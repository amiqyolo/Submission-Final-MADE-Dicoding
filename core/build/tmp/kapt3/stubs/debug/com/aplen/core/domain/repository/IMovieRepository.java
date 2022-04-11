package com.aplen.core.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH&J\u001a\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u00110\u000eH&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u000e2\u0006\u0010\t\u001a\u00020\u0013H&J\"\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u00110\u00152\u0006\u0010\u0016\u001a\u00020\u0013H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H&J\u0019\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/aplen/core/domain/repository/IMovieRepository;", "", "addToFavorite", "", "favorite", "Lcom/aplen/core/domain/model/Movie;", "checkFavorite", "Lio/reactivex/Single;", "", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "deleteFromFavorite", "getAllFavorite", "Lio/reactivex/Flowable;", "", "getAllMovie", "Lcom/aplen/core/data/Resource;", "getDetailMovie", "", "getSearchMovie", "Lio/reactivex/Observable;", "query", "getThemeSettings", "Lkotlinx/coroutines/flow/Flow;", "saveThemeSetting", "isDarkModeActive", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public abstract interface IMovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getAllMovie();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<com.aplen.core.data.Resource<com.aplen.core.domain.model.Movie>> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Flowable<java.util.List<com.aplen.core.domain.model.Movie>> getAllFavorite();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.lang.Boolean> checkFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id);
    
    public abstract void addToFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie favorite);
    
    public abstract void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie favorite);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Boolean> getThemeSettings();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveThemeSetting(boolean isDarkModeActive, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}