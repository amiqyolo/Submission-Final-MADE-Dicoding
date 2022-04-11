package com.aplen.movieaplen.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/aplen/movieaplen/di/AppComponent;", "", "inject", "", "activity", "Lcom/aplen/movieaplen/ui/detail/DetailActivity;", "fragment", "Lcom/aplen/movieaplen/ui/home/HomeFragment;", "Lcom/aplen/movieaplen/ui/main/MainActivity;", "provideMovieInteractor", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "Factory", "app_debug"})
@dagger.Component(dependencies = {com.aplen.core.di.CoreComponent.class}, modules = {com.aplen.movieaplen.di.AppModule.class, com.aplen.movieaplen.di.ViewModelModule.class})
@AppScope()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.aplen.core.domain.usecase.MovieUseCase provideMovieInteractor();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.home.HomeFragment fragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.main.MainActivity activity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.detail.DetailActivity activity);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/aplen/movieaplen/di/AppComponent$Factory;", "", "create", "Lcom/aplen/movieaplen/di/AppComponent;", "coreComponent", "Lcom/aplen/core/di/CoreComponent;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.aplen.movieaplen.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        com.aplen.core.di.CoreComponent coreComponent);
    }
}