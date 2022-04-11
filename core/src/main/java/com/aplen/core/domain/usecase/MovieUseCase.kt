package com.aplen.core.domain.usecase

import com.aplen.core.data.Resource
import com.aplen.core.domain.model.Movie
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovies(): Flowable<Resource<List<Movie>>>

    fun getSearchMovies(query: String): Observable<Resource<List<Movie>>>

    fun getMoviesDetail(id: String): Flowable<Resource<Movie>>

    fun getAllFavorite(): Flowable<List<Movie>>

    fun checkFavorite(id: Int?): Single<Boolean>

    fun addToFavorite(movie: Movie)

    fun deleteFromFavorite(movie: Movie)

    fun getThemeSettings(): Flow<Boolean>

    suspend fun saveThemeSetting(isDarkModeActive: Boolean)
}