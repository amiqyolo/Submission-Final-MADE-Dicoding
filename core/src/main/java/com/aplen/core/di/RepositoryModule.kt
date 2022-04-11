package com.aplen.core.di

import com.aplen.core.data.MovieRepository
import com.aplen.core.domain.repository.IMovieRepository
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        NetworkModule::class,
        DatabaseModule::class,
        CompositeModule::class,
        DataStoreModule::class
    ]
)
abstract class RepositoryModule {
    @Binds
    abstract fun provideRepository(movieRepository: MovieRepository): IMovieRepository
}