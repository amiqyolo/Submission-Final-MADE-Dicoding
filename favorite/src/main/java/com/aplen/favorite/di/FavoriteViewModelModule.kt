package com.aplen.favorite.di

import androidx.lifecycle.ViewModel
import com.aplen.favorite.ui.FavoriteViewModel
import com.aplen.movieaplen.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class FavoriteViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(FavoriteViewModel::class)
    abstract fun bindFavoriteViewModel(viewModel: FavoriteViewModel): ViewModel

}