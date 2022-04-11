package com.aplen.core.data.source.local

import com.aplen.core.data.source.local.entity.FavoriteEntity
import com.aplen.core.data.source.local.room.MovieDao
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class LocalDataSource @Inject constructor(private val movieDao: MovieDao) {

    fun getAllFavorite(): Flowable<List<FavoriteEntity>> = movieDao.getAllFavorite()

    fun checkFavorite(id: Int?): Single<FavoriteEntity?> = movieDao.checkFavorite(id)

    fun addToFavorite(favorite: FavoriteEntity): Completable = movieDao.addToFavorite(favorite)

    fun deleteFromFavorite(favorite: FavoriteEntity): Completable =
        movieDao.deleteFromFavorite(favorite)

}