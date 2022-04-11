package com.aplen.core.data

import android.annotation.SuppressLint
import com.aplen.core.data.source.local.LocalDataSource
import com.aplen.core.data.source.pref.DataStoreManager
import com.aplen.core.data.source.remote.RemoteDataSource
import com.aplen.core.data.source.remote.network.ApiResponse
import com.aplen.core.domain.model.Movie
import com.aplen.core.domain.repository.IMovieRepository
import com.aplen.core.utils.DataMapper
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.PublishSubject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@SuppressLint("CheckResult")
@Singleton
class MovieRepository @Inject constructor(
    private val remote: RemoteDataSource,
    private val local: LocalDataSource,
    private val compositeDisposable: CompositeDisposable,
    private val pref: DataStoreManager
) : IMovieRepository {

    override fun getAllMovie(): Flowable<Resource<List<Movie>>> {
        val resultData = PublishSubject.create<Resource<List<Movie>>>()

        resultData.onNext(Resource.Loading(null))
        remote.getAllMovie()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .take(1)
            .doOnComplete { compositeDisposable.clear() }
            .subscribe { response ->
                when (response) {
                    is ApiResponse.Success -> {
                        val data = DataMapper.responseMovieToDomain(response.data)
                        resultData.onNext(Resource.Success(data))
                    }
                    is ApiResponse.Empty -> resultData.onNext(Resource.Success(emptyList()))
                    is ApiResponse.Error -> resultData.onNext(
                        Resource.Error(response.errorMessage, null)
                    )
                }
            }
            .let { response ->
                compositeDisposable.add(response)
            }

        return resultData.toFlowable(BackpressureStrategy.BUFFER)
    }

    override fun getSearchMovie(query: String): Observable<Resource<List<Movie>>> {
        val resultData = BehaviorSubject.create<Resource<List<Movie>>>()

        resultData.onNext(Resource.Loading(null))
        remote.getSearchMovie(query)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnComplete { compositeDisposable.clear() }
            .subscribe { response ->
                when (response) {
                    is ApiResponse.Success -> {
                        val data = DataMapper.responseMovieToDomain(response.data)
                        resultData.onNext(Resource.Success(data))
                    }
                    is ApiResponse.Empty -> resultData.onNext(Resource.Success(emptyList()))
                    is ApiResponse.Error -> resultData.onNext(
                        Resource.Error(response.errorMessage, null)
                    )
                }
            }
            .let { response ->
                compositeDisposable.add(response)
            }

        return resultData
    }


    override fun getDetailMovie(id: String): Flowable<Resource<Movie>> {
        val resultData = PublishSubject.create<Resource<Movie>>()

        resultData.onNext(Resource.Loading(null))

        remote.getDetailMovie(id.toInt())
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnComplete { compositeDisposable.clear() }
            .subscribe { response ->
                when (response) {
                    is ApiResponse.Success -> {
                        val data = DataMapper.responseDetailToDomain(response.data)
                        resultData.onNext(Resource.Success(data))
                    }
                    is ApiResponse.Empty -> resultData.isEmpty
                    is ApiResponse.Error -> resultData.onNext(
                        Resource.Error(response.errorMessage, null)
                    )
                }
            }.let { response ->
                compositeDisposable.add(response)
            }

        return resultData.toFlowable(BackpressureStrategy.BUFFER)
    }

    override fun checkFavorite(id: Int?): Single<Boolean> {
        return local.checkFavorite(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { true }
            .onErrorReturn { false }
    }

    override fun getAllFavorite() =
        local.getAllFavorite().map { result -> DataMapper.entityFavoritesToDomain(result) }

    override fun addToFavorite(favorite: Movie) {
        local.addToFavorite(DataMapper.domainToEntityFavorite(favorite))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }

    override fun deleteFromFavorite(favorite: Movie) {
        local.deleteFromFavorite(DataMapper.domainToEntityFavorite(favorite))
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe()
    }

    override fun getThemeSettings(): Flow<Boolean> {
        return pref.getThemeSetting()
    }

    override suspend fun saveThemeSetting(isDarkModeActive: Boolean) {
        withContext(Dispatchers.IO) {
            pref.saveThemeSetting(isDarkModeActive)
        }
    }

}