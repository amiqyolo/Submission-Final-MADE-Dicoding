// Generated by Dagger (https://dagger.dev).
package com.aplen.core.data.source.local;

import com.aplen.core.data.source.local.room.MovieDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<MovieDao> movieDaoProvider;

  public LocalDataSource_Factory(Provider<MovieDao> movieDaoProvider) {
    this.movieDaoProvider = movieDaoProvider;
  }

  @Override
  public LocalDataSource get() {
    return newInstance(movieDaoProvider.get());
  }

  public static LocalDataSource_Factory create(Provider<MovieDao> movieDaoProvider) {
    return new LocalDataSource_Factory(movieDaoProvider);
  }

  public static LocalDataSource newInstance(MovieDao movieDao) {
    return new LocalDataSource(movieDao);
  }
}
