// Generated by Dagger (https://dagger.dev).
package com.aplen.movieaplen.ui.detail;

import com.aplen.core.ui.ViewModelFactory;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailActivity_MembersInjector implements MembersInjector<DetailActivity> {
  private final Provider<ViewModelFactory> factoryProvider;

  public DetailActivity_MembersInjector(Provider<ViewModelFactory> factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public static MembersInjector<DetailActivity> create(Provider<ViewModelFactory> factoryProvider) {
    return new DetailActivity_MembersInjector(factoryProvider);
  }

  @Override
  public void injectMembers(DetailActivity instance) {
    injectFactory(instance, factoryProvider.get());
  }

  @InjectedFieldSignature("com.aplen.movieaplen.ui.detail.DetailActivity.factory")
  public static void injectFactory(DetailActivity instance, ViewModelFactory factory) {
    instance.factory = factory;
  }
}
