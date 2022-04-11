package com.aplen.movieaplen.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020)H\u0002J\u001a\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020)H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020)H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/aplen/movieaplen/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/aplen/movieaplen/databinding/FragmentHomeBinding;", "adapter", "Lcom/aplen/core/ui/MovieAdapter;", "binding", "getBinding", "()Lcom/aplen/movieaplen/databinding/FragmentHomeBinding;", "factory", "Lcom/aplen/core/ui/ViewModelFactory;", "getFactory", "()Lcom/aplen/core/ui/ViewModelFactory;", "setFactory", "(Lcom/aplen/core/ui/ViewModelFactory;)V", "homeViewModel", "Lcom/aplen/movieaplen/ui/home/HomeViewModel;", "getHomeViewModel", "()Lcom/aplen/movieaplen/ui/home/HomeViewModel;", "homeViewModel$delegate", "Lkotlin/Lazy;", "lottieImageError", "", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showEmptyView", "isEmpty", "", "showErrorView", "isError", "message", "", "showLoading", "isLoading", "showRecyclerView", "isRecycler", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.aplen.core.ui.MovieAdapter adapter;
    @javax.inject.Inject()
    public com.aplen.core.ui.ViewModelFactory factory;
    private com.aplen.movieaplen.databinding.FragmentHomeBinding _binding;
    private final kotlin.Lazy homeViewModel$delegate = null;
    private int lottieImageError = 0;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aplen.core.ui.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.ViewModelFactory p0) {
    }
    
    private final com.aplen.movieaplen.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    private final com.aplen.movieaplen.ui.home.HomeViewModel getHomeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showEmptyView(boolean isEmpty) {
    }
    
    private final void showErrorView(boolean isError, java.lang.String message) {
    }
    
    private final void showRecyclerView(boolean isRecycler) {
    }
    
    private final void showLoading(boolean isLoading) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}