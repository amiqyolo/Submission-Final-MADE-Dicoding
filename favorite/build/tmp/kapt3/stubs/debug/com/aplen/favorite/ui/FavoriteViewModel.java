package com.aplen.favorite.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R+\u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b \t*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/aplen/favorite/ui/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "(Lcom/aplen/core/domain/usecase/MovieUseCase;)V", "favorite", "Landroidx/lifecycle/LiveData;", "", "Lcom/aplen/core/domain/model/Movie;", "kotlin.jvm.PlatformType", "getFavorite", "()Landroidx/lifecycle/LiveData;", "favorite_debug"})
@com.aplen.favorite.di.FavoriteAppScope()
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.aplen.core.domain.model.Movie>> favorite = null;
    
    @javax.inject.Inject()
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.usecase.MovieUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.aplen.core.domain.model.Movie>> getFavorite() {
        return null;
    }
}