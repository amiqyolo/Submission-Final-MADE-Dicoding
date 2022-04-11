package com.aplen.core.domain.repository

import com.aplen.core.data.Resource
import com.aplen.core.domain.model.Movie
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

interface IMovieRepository {
    fun getAllMovie(): Flowable<Resource<List<Movie>>>

    fun getSearchMovie(query: String): Observable<Resource<List<Movie>>>

    fun getDetailMovie(id: String): Flowable<Resource<Movie>>

    fun getAllFavorite(): Flowable<List<Movie>>

    fun checkFavorite(id: Int?): Single<Boolean>

    fun addToFavorite(favorite: Movie)

    fun deleteFromFavorite(favorite: Movie)

    fun getThemeSettings(): Flow<Boolean>

    suspend fun saveThemeSetting(isDarkModeActive: Boolean)
}