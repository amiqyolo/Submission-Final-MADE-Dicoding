package com.aplen.core.di

import com.aplen.core.BuildConfig
import com.aplen.core.data.source.remote.network.ApiService
import com.aplen.core.utils.Constants
import dagger.Module
import dagger.Provides
import okhttp3.CertificatePinner
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val loggingInterceptor = if (BuildConfig.DEBUG) {
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        } else {
            HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.NONE)
        }

        val certificatePinner = CertificatePinner.Builder()
            .add(Constants.HOSTNAME, "sha256/oD/WAoRPvbez1Y2dfYfuo4yujAcYHXdv1Ivb2v2MOKk=")
            .build()

        return OkHttpClient.Builder().apply {
            addInterceptor { chain ->
                val url = chain.request().url
                    .newBuilder()
                    .addQueryParameter("api_key", Constants.API_KEY)
                    .build()

                val request: Request =
                    chain.request().newBuilder().apply {
                        url(url)
                        addHeader("Accept", "application/json")
                    }.build()
                chain.proceed(request)
            }
            addInterceptor(loggingInterceptor)
            certificatePinner(certificatePinner)
        }.build()
    }

    @Provides
    fun provideApiService(client: OkHttpClient): ApiService {
        val retrofit = Retrofit.Builder().apply {
            baseUrl(Constants.BASE_URL)
            addConverterFactory(GsonConverterFactory.create())
            addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            client(client)
        }.build()
        return retrofit.create(ApiService::class.java)
    }

}