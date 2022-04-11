package com.aplen.core.data.source.remote;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/aplen/core/data/source/remote/RemoteDataSource;", "", "client", "Lcom/aplen/core/data/source/remote/network/ApiService;", "(Lcom/aplen/core/data/source/remote/network/ApiService;)V", "getAllMovie", "Lio/reactivex/Flowable;", "Lcom/aplen/core/data/source/remote/network/ApiResponse;", "", "Lcom/aplen/core/data/source/remote/response/MovieResultsItem;", "getDetailMovie", "Lcom/aplen/core/data/source/remote/response/MovieDetailResponse;", "id", "", "getSearchMovie", "Lio/reactivex/Observable;", "query", "", "core_debug"})
@javax.inject.Singleton()
public final class RemoteDataSource {
    private final com.aplen.core.data.source.remote.network.ApiService client = null;
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.remote.network.ApiService client) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.aplen.core.data.source.remote.network.ApiResponse<java.util.List<com.aplen.core.data.source.remote.response.MovieResultsItem>>> getAllMovie() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.aplen.core.data.source.remote.network.ApiResponse<java.util.List<com.aplen.core.data.source.remote.response.MovieResultsItem>>> getSearchMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.aplen.core.data.source.remote.network.ApiResponse<com.aplen.core.data.source.remote.response.MovieDetailResponse>> getDetailMovie(int id) {
        return null;
    }
}