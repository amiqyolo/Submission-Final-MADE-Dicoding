package com.aplen.movieaplen.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/aplen/movieaplen/di/ViewModelModule;", "", "()V", "bindDetailViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/aplen/movieaplen/ui/detail/DetailViewModel;", "bindHomeViewModel", "Lcom/aplen/movieaplen/ui/home/HomeViewModel;", "bindMainViewModel", "Lcom/aplen/movieaplen/ui/main/MainViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/aplen/core/ui/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.aplen.movieaplen.ui.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.home.HomeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.aplen.movieaplen.ui.main.MainViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindMainViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.main.MainViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.aplen.movieaplen.ui.detail.DetailViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.movieaplen.ui.detail.DetailViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.ViewModelFactory factory);
}