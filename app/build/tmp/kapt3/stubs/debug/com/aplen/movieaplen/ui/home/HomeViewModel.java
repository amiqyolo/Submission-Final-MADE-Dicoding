package com.aplen.movieaplen.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R7\u0010\u0005\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b \n*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/aplen/movieaplen/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "(Lcom/aplen/core/domain/usecase/MovieUseCase;)V", "movies", "Landroidx/lifecycle/LiveData;", "Lcom/aplen/core/data/Resource;", "", "Lcom/aplen/core/domain/model/Movie;", "kotlin.jvm.PlatformType", "getMovies", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> movies = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.usecase.MovieUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> getMovies() {
        return null;
    }
}