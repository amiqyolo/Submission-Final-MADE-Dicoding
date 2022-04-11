package com.aplen.movieaplen

import android.app.Application
import com.aplen.core.di.CoreComponent
import com.aplen.core.di.DaggerCoreComponent
import com.aplen.movieaplen.di.AppComponent
import com.aplen.movieaplen.di.DaggerAppComponent

open class MyApplication : Application() {
    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(coreComponent)
    }

}