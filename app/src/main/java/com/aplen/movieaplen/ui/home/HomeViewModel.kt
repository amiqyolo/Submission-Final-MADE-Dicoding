package com.aplen.movieaplen.ui.home

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.aplen.core.domain.usecase.MovieUseCase
import javax.inject.Inject

class HomeViewModel @Inject constructor(useCase: MovieUseCase) : ViewModel() {
    val movies = LiveDataReactiveStreams.fromPublisher(useCase.getAllMovies())
}