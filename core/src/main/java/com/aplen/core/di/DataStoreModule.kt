package com.aplen.core.di

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore
import com.aplen.core.utils.Constants.MY_PREFERENCE
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataStoreModule {
    @Singleton
    @Provides
    fun provideDataStoreManager(context: Context): DataStore<Preferences> {
        return preferencesDataStore(MY_PREFERENCE).getValue(context, String::javaClass)
    }
}