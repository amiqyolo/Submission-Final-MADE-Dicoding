package com.aplen.movieaplen.ui.detail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0012\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\fH\u0016J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000eH\u0002J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\u0010\u0010\'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/aplen/movieaplen/ui/detail/DetailActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/aplen/movieaplen/databinding/ActivityDetailBinding;", "factory", "Lcom/aplen/core/ui/ViewModelFactory;", "getFactory", "()Lcom/aplen/core/ui/ViewModelFactory;", "setFactory", "(Lcom/aplen/core/ui/ViewModelFactory;)V", "isFavorite", "", "type", "Lcom/aplen/core/domain/model/Movie;", "viewModel", "Lcom/aplen/movieaplen/ui/detail/DetailViewModel;", "getViewModel", "()Lcom/aplen/movieaplen/ui/detail/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addFavorite", "", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onSupportNavigateUp", "populateMovie", "detailMovie", "removeFavorite", "setFavorite", "setupToolbar", "showLoading", "isLoading", "app_debug"})
public final class DetailActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.aplen.movieaplen.databinding.ActivityDetailBinding binding;
    private com.aplen.core.domain.model.Movie type;
    @javax.inject.Inject()
    public com.aplen.core.ui.ViewModelFactory factory;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isFavorite = false;
    
    public DetailActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aplen.core.ui.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.ViewModelFactory p0) {
    }
    
    private final com.aplen.movieaplen.ui.detail.DetailViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addFavorite(com.aplen.core.domain.model.Movie data) {
    }
    
    private final void removeFavorite(com.aplen.core.domain.model.Movie data) {
    }
    
    private final void populateMovie(com.aplen.core.domain.model.Movie detailMovie) {
    }
    
    private final void setFavorite(com.aplen.core.domain.model.Movie data) {
    }
    
    private final void showLoading(boolean isLoading) {
    }
    
    private final void setupToolbar() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
}