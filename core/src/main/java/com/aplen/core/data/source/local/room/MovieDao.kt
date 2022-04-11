package com.aplen.core.data.source.local.room

import androidx.room.*
import com.aplen.core.data.source.local.entity.FavoriteEntity
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface MovieDao {
    @Query("SELECT * FROM favoritesentities")
    fun getAllFavorite(): Flowable<List<FavoriteEntity>>

    @Query("SELECT * FROM favoritesentities WHERE id = :id")
    fun checkFavorite(id: Int?): Single<FavoriteEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addToFavorite(favorite: FavoriteEntity?): Completable

    @Delete
    fun deleteFromFavorite(favorite: FavoriteEntity): Completable
}