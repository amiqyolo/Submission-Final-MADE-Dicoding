package com.aplen.setting.di

import com.aplen.movieaplen.di.AppComponent
import com.aplen.setting.ui.SettingFragment
import dagger.Component

@SettingAppScope
@Component(dependencies = [AppComponent::class], modules = [SettingViewModelModule::class])
interface SettingComponent {

    @Component.Factory
    interface Factory {
        fun create(appComponent: AppComponent): SettingComponent
    }

    fun inject(fragment: SettingFragment)

}