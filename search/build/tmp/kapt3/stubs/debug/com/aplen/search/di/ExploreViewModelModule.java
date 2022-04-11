package com.aplen.search.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/aplen/search/di/ExploreViewModelModule;", "", "()V", "bindExploreViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/aplen/search/ui/ExploreViewModel;", "search_debug"})
@dagger.Module()
public abstract class ExploreViewModelModule {
    
    public ExploreViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.aplen.movieaplen.di.ViewModelKey(value = com.aplen.search.ui.ExploreViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindExploreViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.search.ui.ExploreViewModel viewModel);
}