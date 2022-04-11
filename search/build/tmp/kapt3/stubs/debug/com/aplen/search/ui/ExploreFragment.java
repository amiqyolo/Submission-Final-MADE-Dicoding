package com.aplen.search.ui;

import java.lang.System;

@android.annotation.SuppressLint(value = {"CheckResult"})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u001aH\u0016J\u001a\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0002J\u001a\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u00101\u001a\u00020\u001a2\u0006\u00102\u001a\u00020-H\u0002J\u0010\u00103\u001a\u00020\u001a2\u0006\u00104\u001a\u00020-H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/aplen/search/ui/ExploreFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/aplen/search/databinding/FragmentExploreBinding;", "adapter", "Lcom/aplen/core/ui/MovieAdapter;", "binding", "getBinding", "()Lcom/aplen/search/databinding/FragmentExploreBinding;", "exploreViewModel", "Lcom/aplen/search/ui/ExploreViewModel;", "getExploreViewModel", "()Lcom/aplen/search/ui/ExploreViewModel;", "exploreViewModel$delegate", "Lkotlin/Lazy;", "factory", "Lcom/aplen/core/ui/ViewModelFactory;", "getFactory", "()Lcom/aplen/core/ui/ViewModelFactory;", "setFactory", "(Lcom/aplen/core/ui/ViewModelFactory;)V", "lottieImageEmpty", "", "lottieImageError", "observeExplore", "", "text", "", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showEmptyView", "isEmpty", "", "showErrorView", "isError", "message", "showLoading", "isLoading", "showRecyclerView", "isRecycler", "search_debug"})
public final class ExploreFragment extends androidx.fragment.app.Fragment {
    private com.aplen.core.ui.MovieAdapter adapter;
    @javax.inject.Inject()
    public com.aplen.core.ui.ViewModelFactory factory;
    private com.aplen.search.databinding.FragmentExploreBinding _binding;
    private final kotlin.Lazy exploreViewModel$delegate = null;
    private int lottieImageEmpty = 0;
    private int lottieImageError = 0;
    
    public ExploreFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.aplen.core.ui.ViewModelFactory getFactory() {
        return null;
    }
    
    public final void setFactory(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.ViewModelFactory p0) {
    }
    
    private final com.aplen.search.databinding.FragmentExploreBinding getBinding() {
        return null;
    }
    
    private final com.aplen.search.ui.ExploreViewModel getExploreViewModel() {
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
    
    private final void observeExplore(java.lang.String text) {
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