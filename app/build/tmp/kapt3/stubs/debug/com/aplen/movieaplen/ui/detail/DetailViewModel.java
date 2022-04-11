package com.aplen.movieaplen.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \f*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f0\u000f0\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/aplen/movieaplen/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "(Lcom/aplen/core/domain/usecase/MovieUseCase;)V", "addToFavorite", "", "movie", "Lcom/aplen/core/domain/model/Movie;", "checkFavorite", "Landroidx/lifecycle/LiveData;", "", "kotlin.jvm.PlatformType", "deleteFromFavorite", "getDetailMovies", "Lcom/aplen/core/data/Resource;", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final com.aplen.core.domain.usecase.MovieUseCase useCase = null;
    
    @javax.inject.Inject()
    public DetailViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.usecase.MovieUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.aplen.core.data.Resource<com.aplen.core.domain.model.Movie>> getDetailMovies(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> checkFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
        return null;
    }
    
    public final void addToFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
    }
    
    public final void deleteFromFavorite(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.model.Movie movie) {
    }
}