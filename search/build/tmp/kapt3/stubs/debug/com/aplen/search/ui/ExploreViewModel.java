package com.aplen.search.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J4\u0010\u0005\u001a(\u0012$\u0012\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b \n*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00070\u00070\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/aplen/search/ui/ExploreViewModel;", "Landroidx/lifecycle/ViewModel;", "useCase", "Lcom/aplen/core/domain/usecase/MovieUseCase;", "(Lcom/aplen/core/domain/usecase/MovieUseCase;)V", "exploreMovie", "Landroidx/lifecycle/LiveData;", "Lcom/aplen/core/data/Resource;", "", "Lcom/aplen/core/domain/model/Movie;", "kotlin.jvm.PlatformType", "query", "", "searchResult", "Lio/reactivex/Flowable;", "searchView", "Landroidx/appcompat/widget/SearchView;", "search_debug"})
@com.aplen.search.di.ExploreAppScope()
public final class ExploreViewModel extends androidx.lifecycle.ViewModel {
    private final com.aplen.core.domain.usecase.MovieUseCase useCase = null;
    
    @javax.inject.Inject()
    public ExploreViewModel(@org.jetbrains.annotations.NotNull()
    com.aplen.core.domain.usecase.MovieUseCase useCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.aplen.core.data.Resource<java.util.List<com.aplen.core.domain.model.Movie>>> exploreMovie(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<java.lang.String> searchResult(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.widget.SearchView searchView) {
        return null;
    }
}