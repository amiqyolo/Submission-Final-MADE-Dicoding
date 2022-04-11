package com.aplen.search.di

import androidx.lifecycle.ViewModel
import com.aplen.movieaplen.di.ViewModelKey
import com.aplen.search.ui.ExploreViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ExploreViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ExploreViewModel::class)
    abstract fun bindExploreViewModel(viewModel: ExploreViewModel): ViewModel
}