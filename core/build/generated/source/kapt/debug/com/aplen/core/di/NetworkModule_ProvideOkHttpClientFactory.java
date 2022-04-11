// Generated by Dagger (https://dagger.dev).
package com.aplen.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module);
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module) {
    return new NetworkModule_ProvideOkHttpClientFactory(module);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkHttpClient());
  }
}
