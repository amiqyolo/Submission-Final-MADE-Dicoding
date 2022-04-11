package com.aplen.movieaplen.di

import com.aplen.core.domain.usecase.MovieInteractor
import com.aplen.core.domain.usecase.MovieUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {
    @Binds
    abstract fun provideMovieUseCase(movieInteractor: MovieInteractor): MovieUseCase
}
