package com.aplen.core.data.source.remote

import android.annotation.SuppressLint
import com.aplen.core.data.source.remote.network.ApiResponse
import com.aplen.core.data.source.remote.network.ApiService
import com.aplen.core.data.source.remote.response.MovieDetailResponse
import com.aplen.core.data.source.remote.response.MovieResultsItem
import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import javax.inject.Inject
import javax.inject.Singleton

@SuppressLint("CheckResult")
@Singleton
class RemoteDataSource @Inject constructor(private val client: ApiService) {

    fun getAllMovie(): Flowable<ApiResponse<List<MovieResultsItem>>> {
        val resultData = PublishSubject.create<ApiResponse<List<MovieResultsItem>>>()

        client.getAllMovie()
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .take(1)
            .subscribe({ response ->
                val resultsItem = response.results
                resultData.onNext(if (resultsItem.isNotEmpty()) ApiResponse.Success(resultsItem) else ApiResponse.Empty)
            }, { error ->
                resultData.onNext(ApiResponse.Error(error.message.toString()))
            })

        return resultData.toFlowable(BackpressureStrategy.BUFFER)
    }

    fun getSearchMovie(query: String): Observable<ApiResponse<List<MovieResultsItem>>> {
        return Observable.create { resultData ->
            client.getSearchMovie(query)
                .subscribeOn(Schedulers.computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ response ->
                    val resultsItem = response.results
                    resultData.onNext(
                        if (resultsItem.isNotEmpty()) ApiResponse.Success(resultsItem)
                        else ApiResponse.Empty
                    )
                }, { error ->
                    resultData.onNext(ApiResponse.Error(error.message.toString()))
                })
        }
    }

    fun getDetailMovie(id: Int): Flowable<ApiResponse<MovieDetailResponse>> {
        val resultData = PublishSubject.create<ApiResponse<MovieDetailResponse>>()

        client.getDetailMovie(id)
            .subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .take(1)
            .subscribe({ response ->
                resultData.onNext(if (response != null) ApiResponse.Success(response) else ApiResponse.Empty)
            }, { error ->
                resultData.onNext(ApiResponse.Error(error.message.toString()))
            })

        return resultData.toFlowable(BackpressureStrategy.BUFFER)
    }

}