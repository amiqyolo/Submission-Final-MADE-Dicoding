package com.aplen.core.data.source.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\'\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\rH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/aplen/core/data/source/local/room/MovieDao;", "", "addToFavorite", "Lio/reactivex/Completable;", "favorite", "Lcom/aplen/core/data/source/local/entity/FavoriteEntity;", "checkFavorite", "Lio/reactivex/Single;", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "deleteFromFavorite", "getAllFavorite", "Lio/reactivex/Flowable;", "", "core_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favoritesentities")
    public abstract io.reactivex.Flowable<java.util.List<com.aplen.core.data.source.local.entity.FavoriteEntity>> getAllFavorite();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM favoritesentities WHERE id = :id")
    public abstract io.reactivex.Single<com.aplen.core.data.source.local.entity.FavoriteEntity> checkFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.Completable addToFavorite(@org.jetbrains.annotations.Nullable()
    com.aplen.core.data.source.local.entity.FavoriteEntity favorite);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Delete()
    public abstract io.reactivex.Completable deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.entity.FavoriteEntity favorite);
}