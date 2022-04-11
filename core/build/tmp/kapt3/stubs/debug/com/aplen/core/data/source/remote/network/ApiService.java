package com.aplen.core.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/aplen/core/data/source/remote/network/ApiService;", "", "getAllMovie", "Lio/reactivex/Flowable;", "Lcom/aplen/core/data/source/remote/response/MovieResponse;", "getDetailMovie", "Lcom/aplen/core/data/source/remote/response/MovieDetailResponse;", "id", "", "getSearchMovie", "Lio/reactivex/Observable;", "query", "", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract io.reactivex.Flowable<com.aplen.core.data.source.remote.response.MovieResponse> getAllMovie();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/{movie_id}")
    public abstract io.reactivex.Flowable<com.aplen.core.data.source.remote.response.MovieDetailResponse> getDetailMovie(@retrofit2.http.Path(value = "movie_id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/movie")
    public abstract io.reactivex.Observable<com.aplen.core.data.source.remote.response.MovieResponse> getSearchMovie(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
}