package com.aplen.movieaplen.ui.detail

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.aplen.core.domain.model.Movie
import com.aplen.core.domain.usecase.MovieUseCase
import javax.inject.Inject

class DetailViewModel @Inject constructor(private val useCase: MovieUseCase) : ViewModel() {

    fun getDetailMovies(movie: Movie) =
        LiveDataReactiveStreams.fromPublisher(useCase.getMoviesDetail(movie.id.toString()))

    fun checkFavorite(movie: Movie) =
        LiveDataReactiveStreams.fromPublisher(
            useCase.checkFavorite(movie.id).toFlowable()
        )

    fun addToFavorite(movie: Movie) =
        useCase.addToFavorite(movie)

    fun deleteFromFavorite(movie: Movie) =
        useCase.deleteFromFavorite(movie)

}