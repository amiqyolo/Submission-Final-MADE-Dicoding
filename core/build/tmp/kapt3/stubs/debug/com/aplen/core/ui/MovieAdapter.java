package com.aplen.core.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0012\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/aplen/core/ui/MovieAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/aplen/core/domain/model/Movie;", "Lcom/aplen/core/ui/MovieAdapter$MoviesViewHolder;", "()V", "onItemClickCallback", "Lcom/aplen/core/ui/MovieAdapter$OnItemClickCallBack;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallBack", "onItemClickCallBack", "MoviesAdapterComparator", "MoviesViewHolder", "OnItemClickCallBack", "core_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.ListAdapter<com.aplen.core.domain.model.Movie, com.aplen.core.ui.MovieAdapter.MoviesViewHolder> {
    private com.aplen.core.ui.MovieAdapter.OnItemClickCallBack onItemClickCallback;
    
    public MovieAdapter() {
        super(null);
    }
    
    public final void setOnItemClickCallBack(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.MovieAdapter.OnItemClickCallBack onItemClickCallBack) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.aplen.core.ui.MovieAdapter.MoviesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.aplen.core.ui.MovieAdapter.MoviesViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/aplen/core/ui/MovieAdapter$OnItemClickCallBack;", "", "onItemClicked", "", "data", "Lcom/aplen/core/domain/model/Movie;", "core_debug"})
    public static abstract interface OnItemClickCallBack {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie data);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/aplen/core/ui/MovieAdapter$MoviesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/aplen/core/databinding/ItemRowMovieBinding;", "(Lcom/aplen/core/ui/MovieAdapter;Lcom/aplen/core/databinding/ItemRowMovieBinding;)V", "bind", "", "movie", "Lcom/aplen/core/domain/model/Movie;", "core_debug"})
    public final class MoviesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.aplen.core.databinding.ItemRowMovieBinding binding = null;
        
        public MoviesViewHolder(@org.jetbrains.annotations.NotNull()
        com.aplen.core.databinding.ItemRowMovieBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie movie) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/aplen/core/ui/MovieAdapter$MoviesAdapterComparator;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/aplen/core/domain/model/Movie;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "core_debug"})
    public static final class MoviesAdapterComparator extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.aplen.core.domain.model.Movie> {
        
        public MoviesAdapterComparator() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie oldItem, @org.jetbrains.annotations.NotNull()
        com.aplen.core.domain.model.Movie newItem) {
            return false;
        }
    }
}