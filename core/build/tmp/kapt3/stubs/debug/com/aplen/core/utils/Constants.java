package com.aplen.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/aplen/core/utils/Constants;", "", "()V", "API_KEY", "", "BASE_URL", "DATA", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getDATA", "()Landroidx/datastore/preferences/core/Preferences$Key;", "ELEVATION", "", "EXTRA_MOVIE", "FAVORITES_TABLE", "HOSTNAME", "IMAGE_URL", "MOVIE_DB", "MY_PREFERENCE", "SUCCESS_INSERT", "SUCCESS_REMOVE", "mimeType", "core_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.aplen.core.utils.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String HOSTNAME = "api.themoviedb.org";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String API_KEY = "55486a2fdcc4b16f3e671cfc5722354b";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_URL = "https://image.tmdb.org/t/p/w500";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MOVIE = "extra_movie";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MOVIE_DB = "movie_database";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FAVORITES_TABLE = "favoritesentities";
    public static final float ELEVATION = 0.0F;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String mimeType = "text/plain";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_INSERT = "Success Add to Favorite List!";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUCCESS_REMOVE = "Success Remove from Favorite List!";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MY_PREFERENCE = "settings";
    @org.jetbrains.annotations.NotNull()
    private static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> DATA = null;
    
    private Constants() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> getDATA() {
        return null;
    }
}