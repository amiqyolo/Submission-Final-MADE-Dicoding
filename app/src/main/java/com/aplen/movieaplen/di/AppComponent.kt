package com.aplen.movieaplen.di

import com.aplen.core.di.CoreComponent
import com.aplen.core.domain.usecase.MovieUseCase
import com.aplen.movieaplen.ui.detail.DetailActivity
import com.aplen.movieaplen.ui.home.HomeFragment
import com.aplen.movieaplen.ui.main.MainActivity
import dagger.Component

@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun provideMovieInteractor(): MovieUseCase

    fun inject(fragment: HomeFragment)
    fun inject(activity: MainActivity)
    fun inject(activity: DetailActivity)
}