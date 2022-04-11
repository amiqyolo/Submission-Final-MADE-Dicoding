package com.aplen.search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/aplen/search/di/ExploreComponent;", "", "inject", "", "fragment", "Lcom/aplen/search/ui/ExploreFragment;", "Factory", "search_debug"})
@dagger.Component(dependencies = {com.aplen.movieaplen.di.AppComponent.class}, modules = {com.aplen.search.di.ExploreViewModelModule.class})
@ExploreAppScope()
public abstract interface ExploreComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.aplen.search.ui.ExploreFragment fragment);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/aplen/search/di/ExploreComponent$Factory;", "", "create", "Lcom/aplen/search/di/ExploreComponent;", "appComponent", "Lcom/aplen/movieaplen/di/AppComponent;", "search_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.aplen.search.di.ExploreComponent create(@org.jetbrains.annotations.NotNull()
        com.aplen.movieaplen.di.AppComponent appComponent);
    }
}