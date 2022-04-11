package com.aplen.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u0011H\u0016J\u001a\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u00140\u0011H\u0016J\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00140\u00112\u0006\u0010\f\u001a\u00020\u0016H\u0016J\"\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00120\u00140\u00182\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001bH\u0016J\u0019\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/aplen/core/domain/usecase/MovieInteractor;", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "movieRepository", "Lcom/aplen/core/domain/repository/IMovieRepository;", "(Lcom/aplen/core/domain/repository/IMovieRepository;)V", "addToFavorite", "", "movie", "Lcom/aplen/core/domain/model/Movie;", "checkFavorite", "Lio/reactivex/Single;", "", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "deleteFromFavorite", "getAllFavorite", "Lio/reactivex/Flowable;", "", "getAllMovies", "Lcom/aplen/core/data/Resource;", "getMoviesDetail", "", "getSearchMovies", "Lio/reactivex/Observable;", "query", "getThemeSettings", "Lkotlinx/coroutines/flow/Flow;", "saveThemeSetting", "isDarkModeActive", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class MovieInteractor implements com.aplen.core.domain.usecase.MovieUseCase {
    private final com.aplen.core.domain.repository.IMovieRepository movieRepository = null;
    
    @javax.inject.Inject()
    public MovieInteractor(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.repository.IMovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getSearchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.aplen.core.data.Resource<com.aplen.core.domain.model.Movie>> getMoviesDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.aplen.core.domain.model.Movie>> getAllFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Boolean> checkFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @java.lang.Override()
    public void addToFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
    }
    
    @java.lang.Override()
    public void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlinx.coroutines.flow.Flow<java.lang.Boolean> getThemeSettings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveThemeSetting(boolean isDarkModeActive, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}