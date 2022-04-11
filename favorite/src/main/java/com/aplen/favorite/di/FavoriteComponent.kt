package com.aplen.favorite.di

import com.aplen.favorite.ui.FavoriteFragment
import com.aplen.movieaplen.di.AppComponent
import dagger.Component

@FavoriteAppScope
@Component(dependencies = [AppComponent::class], modules = [FavoriteViewModelModule::class])
interface FavoriteComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): FavoriteComponent
    }

    fun inject(fragment: FavoriteFragment)

}
