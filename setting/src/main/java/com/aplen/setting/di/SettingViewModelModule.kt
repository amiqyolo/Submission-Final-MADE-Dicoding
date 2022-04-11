package com.aplen.setting.di

import androidx.lifecycle.ViewModel
import com.aplen.movieaplen.di.ViewModelKey
import com.aplen.setting.ui.SettingViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class SettingViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SettingViewModel::class)
    abstract fun bindSettingViewModel(viewModel: SettingViewModel): ViewModel
}