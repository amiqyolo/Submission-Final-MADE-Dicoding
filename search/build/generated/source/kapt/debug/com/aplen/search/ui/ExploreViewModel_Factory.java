// Generated by Dagger (https://dagger.dev).
package com.aplen.search.ui;

import com.aplen.core.domain.usecase.MovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("com.aplen.search.di.ExploreAppScope")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ExploreViewModel_Factory implements Factory<ExploreViewModel> {
  private final Provider<MovieUseCase> useCaseProvider;

  public ExploreViewModel_Factory(Provider<MovieUseCase> useCaseProvider) {
    this.useCaseProvider = useCaseProvider;
  }

  @Override
  public ExploreViewModel get() {
    return newInstance(useCaseProvider.get());
  }

  public static ExploreViewModel_Factory create(Provider<MovieUseCase> useCaseProvider) {
    return new ExploreViewModel_Factory(useCaseProvider);
  }

  public static ExploreViewModel newInstance(MovieUseCase useCase) {
    return new ExploreViewModel(useCase);
  }
}
