package com.aplen.favorite.ui

import androidx.lifecycle.LiveDataReactiveStreams
import androidx.lifecycle.ViewModel
import com.aplen.core.domain.usecase.MovieUseCase
import com.aplen.favorite.di.FavoriteAppScope
import javax.inject.Inject

@FavoriteAppScope
class FavoriteViewModel @Inject constructor(useCase: MovieUseCase) : ViewModel() {
    val favorite = LiveDataReactiveStreams.fromPublisher(useCase.getAllFavorite())
}