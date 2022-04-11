package com.aplen.core.data;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\"\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u000e \u0019*\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00180\u00180\u0017H\u0016J\u001a\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00180\u001b0\u0017H\u0016J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001b0\u00172\u0006\u0010\u0012\u001a\u00020\u001dH\u0016J\"\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00180\u001b0\u001f2\u0006\u0010 \u001a\u00020\u001dH\u0016J\u000e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\"H\u0016J\u0019\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/aplen/core/data/MovieRepository;", "Lcom/aplen/core/domain/repository/IMovieRepository;", "remote", "Lcom/aplen/core/data/source/remote/RemoteDataSource;", "local", "Lcom/aplen/core/data/source/local/LocalDataSource;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "pref", "Lcom/aplen/core/data/source/pref/DataStoreManager;", "(Lcom/aplen/core/data/source/remote/RemoteDataSource;Lcom/aplen/core/data/source/local/LocalDataSource;Lio/reactivex/disposables/CompositeDisposable;Lcom/aplen/core/data/source/pref/DataStoreManager;)V", "addToFavorite", "", "favorite", "Lcom/aplen/core/domain/model/Movie;", "checkFavorite", "Lio/reactivex/Single;", "", "id", "", "(Ljava/lang/Integer;)Lio/reactivex/Single;", "deleteFromFavorite", "getAllFavorite", "Lio/reactivex/Flowable;", "", "kotlin.jvm.PlatformType", "getAllMovie", "Lcom/aplen/core/data/Resource;", "getDetailMovie", "", "getSearchMovie", "Lio/reactivex/Observable;", "query", "getThemeSettings", "Lkotlinx/coroutines/flow/Flow;", "saveThemeSetting", "isDarkModeActive", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
@javax.inject.Singleton()
public final class MovieRepository implements com.aplen.core.domain.repository.IMovieRepository {
    private final com.aplen.core.data.source.remote.RemoteDataSource remote = null;
    private final com.aplen.core.data.source.local.LocalDataSource local = null;
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    private final com.aplen.core.data.source.pref.DataStoreManager pref = null;
    
    @javax.inject.Inject()
    public MovieRepository(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.remote.RemoteDataSource remote, @org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.local.LocalDataSource local, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable, @org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.pref.DataStoreManager pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<com.aplen.core.data.Resource<com.aplen.core.domain.model.Movie>> getDetailMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.lang.Boolean> checkFavorite(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Flowable<java.util.List<com.aplen.core.domain.model.Movie>> getAllFavorite() {
        return null;
    }
    
    @java.lang.Override()
    public void addToFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie favorite) {
    }
    
    @java.lang.Override()
    public void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie favorite) {
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