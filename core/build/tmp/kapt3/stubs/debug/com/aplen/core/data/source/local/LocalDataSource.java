package com.aplen.core.data.source.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001d\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/aplen/core/data/source/local/LocalDataSource;", "", "movieDao", "Lcom/aplen/core/data/source/local/room/MovieDao;", "(Lcom/aplen/core/data/source/local/room/MovieDao;)V", "addToFavorite", "Lio/reactivex/Completable;", "favorite", "Lcom/aplen/core/data/source/local/entity/FavoriteEntity;", "checkFavorite", "Lio/reactivex/Single;", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "deleteFromFavorite", "getAllFavorite", "Lio/reactivex/Flowable;", "", "core_debug"})
@javax.inject.Singleton()
public final class LocalDataSource {
    private final com.aplen.core.data.source.local.room.MovieDao movieDao = null;
    
    @javax.inject.Inject()
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.room.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.util.List<com.aplen.core.data.source.local.entity.FavoriteEntity>> getAllFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.aplen.core.data.source.local.entity.FavoriteEntity> checkFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable addToFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.entity.FavoriteEntity favorite) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.entity.FavoriteEntity favorite) {
        return null;
    }
}