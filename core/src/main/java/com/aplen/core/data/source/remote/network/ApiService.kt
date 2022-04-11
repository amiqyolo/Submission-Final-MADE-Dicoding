package com.aplen.core.data.source.remote.network

import com.aplen.core.data.source.remote.response.MovieDetailResponse
import com.aplen.core.data.source.remote.response.MovieResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    fun getAllMovie(): Flowable<MovieResponse>

    @GET("movie/{movie_id}")
    fun getDetailMovie(@Path("movie_id") id: Int): Flowable<MovieDetailResponse>

    @GET("search/movie")
    fun getSearchMovie(@Query("query") query: String): Observable<MovieResponse>
}