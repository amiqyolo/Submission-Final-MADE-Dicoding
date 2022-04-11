package com.aplen.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/aplen/core/di/DatabaseModule;", "", "()V", "provideDatabase", "Lcom/aplen/core/data/source/local/room/MovieDatabase;", "context", "Landroid/content/Context;", "provideFavoriteDao", "Lcom/aplen/core/data/source/local/room/MovieDao;", "database", "core_debug"})
@dagger.Module()
public final class DatabaseModule {
    
    public DatabaseModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.aplen.core.data.source.local.room.MovieDatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.aplen.core.data.source.local.room.MovieDao provideFavoriteDao(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.room.MovieDatabase database) {
        return null;
    }
}