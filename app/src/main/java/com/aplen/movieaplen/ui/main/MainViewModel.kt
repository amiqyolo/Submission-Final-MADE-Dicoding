package com.aplen.movieaplen.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.aplen.core.domain.usecase.MovieUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(useCase: MovieUseCase) : ViewModel() {
    val themeSetting = useCase.getThemeSettings().asLiveData()
}