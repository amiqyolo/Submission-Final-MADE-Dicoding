package com.aplen.core.utils

import androidx.datastore.preferences.core.booleanPreferencesKey
import com.aplen.core.BuildConfig

object Constants {
    const val HOSTNAME = BuildConfig.HOSTNAME
    const val BASE_URL = BuildConfig.BASE_URL
    const val API_KEY = BuildConfig.API_KEY
    const val IMAGE_URL = BuildConfig.IMAGE_URL
    const val EXTRA_MOVIE = "extra_movie"
    const val MOVIE_DB = "movie_database"
    const val FAVORITES_TABLE = "favoritesentities"
    const val ELEVATION = 0f
    const val mimeType = "text/plain"
    const val SUCCESS_INSERT = "Success Add to Favorite List!"
    const val SUCCESS_REMOVE = "Success Remove from Favorite List!"
    const val MY_PREFERENCE = "settings"
    val DATA = booleanPreferencesKey("themes_setting")
}