package com.aplen.core.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/aplen/core/di/RepositoryModule;", "", "()V", "provideRepository", "Lcom/aplen/core/domain/repository/IMovieRepository;", "movieRepository", "Lcom/aplen/core/data/MovieRepository;", "core_debug"})
@dagger.Module(includes = {com.aplen.core.di.NetworkModule.class, com.aplen.core.di.DatabaseModule.class, com.aplen.core.di.CompositeModule.class, com.aplen.core.di.DataStoreModule.class})
public abstract class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.aplen.core.domain.repository.IMovieRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.aplen.core.data.MovieRepository movieRepository);
}