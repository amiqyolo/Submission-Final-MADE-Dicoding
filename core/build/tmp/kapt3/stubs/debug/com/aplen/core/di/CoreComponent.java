package com.aplen.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0004J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/aplen/core/di/CoreComponent;", "", "provideRepository", "Lcom/aplen/core/domain/repository/IMovieRepository;", "Factory", "core_debug"})
@dagger.Component(modules = {com.aplen.core.di.RepositoryModule.class})
@javax.inject.Singleton()
public abstract interface CoreComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.aplen.core.domain.repository.IMovieRepository provideRepository();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/aplen/core/di/CoreComponent$Factory;", "", "create", "Lcom/aplen/core/di/CoreComponent;", "context", "Landroid/content/Context;", "core_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.aplen.core.di.CoreComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context context);
    }
}