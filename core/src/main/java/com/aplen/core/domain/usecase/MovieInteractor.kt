package com.aplen.core.domain.usecase

import com.aplen.core.domain.model.Movie
import com.aplen.core.domain.repository.IMovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieInteractor @Inject constructor(private val movieRepository: IMovieRepository) :
    MovieUseCase {

    override fun getAllMovies() = movieRepository.getAllMovie()

    override fun getSearchMovies(query: String) = movieRepository.getSearchMovie(query)

    override fun getMoviesDetail(id: String) = movieRepository.getDetailMovie(id)

    override fun getAllFavorite() = movieRepository.getAllFavorite()

    override fun checkFavorite(id: Int?) = movieRepository.checkFavorite(id)

    override fun addToFavorite(movie: Movie) = movieRepository.addToFavorite(movie)

    override fun deleteFromFavorite(movie: Movie) =
        movieRepository.deleteFromFavorite(movie)

    override fun getThemeSettings(): Flow<Boolean> = movieRepository.getThemeSettings()

    override suspend fun saveThemeSetting(isDarkModeActive: Boolean) =
        movieRepository.saveThemeSetting(isDarkModeActive)

}