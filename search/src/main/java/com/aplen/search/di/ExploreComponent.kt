package com.aplen.search.di

import com.aplen.movieaplen.di.AppComponent
import com.aplen.search.ui.ExploreFragment
import dagger.Component

@ExploreAppScope
@Component(dependencies = [AppComponent::class], modules = [ExploreViewModelModule::class])
interface ExploreComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): ExploreComponent
    }

    fun inject(fragment: ExploreFragment)

}