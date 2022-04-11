package com.aplen.movieaplen.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aplen.core.ui.ViewModelFactory
import com.aplen.movieaplen.ui.detail.DetailViewModel
import com.aplen.movieaplen.ui.home.HomeViewModel
import com.aplen.movieaplen.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel::class)
    abstract fun bindDetailViewModel(viewModel: DetailViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

}