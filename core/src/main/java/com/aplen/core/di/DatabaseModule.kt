package com.aplen.core.di

import android.content.Context
import androidx.room.Room
import com.aplen.core.data.source.local.room.MovieDao
import com.aplen.core.data.source.local.room.MovieDatabase
import com.aplen.core.utils.Constants
import dagger.Module
import dagger.Provides
import net.sqlcipher.database.SQLiteDatabase
import net.sqlcipher.database.SupportFactory
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(context: Context): MovieDatabase {
        val passPhrase: ByteArray = SQLiteDatabase.getBytes("movieAplen".toCharArray())
        val factory = SupportFactory(passPhrase)
        return Room.databaseBuilder(
            context,
            MovieDatabase::class.java,
            Constants.MOVIE_DB
        )
            .fallbackToDestructiveMigration()
            .openHelperFactory(factory)
            .build()
    }

    @Provides
    fun provideFavoriteDao(database: MovieDatabase): MovieDao {
        return database.movieDao()
    }
}