package com.aplen.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bH\u0002J\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\b\u00a8\u0006\u0013"}, d2 = {"Lcom/aplen/core/utils/DataMapper;", "", "()V", "domainToEntityFavorite", "Lcom/aplen/core/data/source/local/entity/FavoriteEntity;", "movie", "Lcom/aplen/core/domain/model/Movie;", "entityFavoritesToDomain", "", "favorites", "responseDetailToDomain", "Lcom/aplen/core/data/source/remote/response/MovieDetailResponse;", "responseGenresToModels", "Lcom/aplen/core/domain/model/Genre;", "genres", "Lcom/aplen/core/data/source/remote/response/GenresItem;", "responseMovieToDomain", "movies", "Lcom/aplen/core/data/source/remote/response/MovieResultsItem;", "core_debug"})
public final class DataMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.aplen.core.utils.DataMapper INSTANCE = null;
    
    private DataMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.aplen.core.domain.model.Movie> responseMovieToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aplen.core.data.source.remote.response.MovieResultsItem> movies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.aplen.core.domain.model.Movie> entityFavoritesToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.aplen.core.data.source.local.entity.FavoriteEntity> favorites) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aplen.core.data.source.local.entity.FavoriteEntity domainToEntityFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aplen.core.domain.model.Movie responseDetailToDomain(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.source.remote.response.MovieDetailResponse movie) {
        return null;
    }
    
    private final java.util.List<com.aplen.core.domain.model.Genre> responseGenresToModels(java.util.List<com.aplen.core.data.source.remote.response.GenresItem> genres) {
        return null;
    }
}