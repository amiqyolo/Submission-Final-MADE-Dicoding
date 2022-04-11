// Generated by view binder compiler. Do not edit!
package com.aplen.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.airbnb.lottie.LottieAnimationView;
import com.aplen.search.R;
import com.facebook.shimmer.ShimmerFrameLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentExploreBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SearchView itemSearch;

  @NonNull
  public final LottieAnimationView lottieView;

  @NonNull
  public final RecyclerView rvMovie;

  @NonNull
  public final TextView tvDescExplore;

  @NonNull
  public final TextView tvTitleExplore;

  @NonNull
  public final ShimmerFrameLayout viewShimmer;

  private FragmentExploreBinding(@NonNull ConstraintLayout rootView, @NonNull SearchView itemSearch,
      @NonNull LottieAnimationView lottieView, @NonNull RecyclerView rvMovie,
      @NonNull TextView tvDescExplore, @NonNull TextView tvTitleExplore,
      @NonNull ShimmerFrameLayout viewShimmer) {
    this.rootView = rootView;
    this.itemSearch = itemSearch;
    this.lottieView = lottieView;
    this.rvMovie = rvMovie;
    this.tvDescExplore = tvDescExplore;
    this.tvTitleExplore = tvTitleExplore;
    this.viewShimmer = viewShimmer;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentExploreBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentExploreBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_explore, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentExploreBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.item_search;
      SearchView itemSearch = ViewBindings.findChildViewById(rootView, id);
      if (itemSearch == null) {
        break missingId;
      }

      id = R.id.lottie_view;
      LottieAnimationView lottieView = ViewBindings.findChildViewById(rootView, id);
      if (lottieView == null) {
        break missingId;
      }

      id = R.id.rv_movie;
      RecyclerView rvMovie = ViewBindings.findChildViewById(rootView, id);
      if (rvMovie == null) {
        break missingId;
      }

      id = R.id.tv_desc_explore;
      TextView tvDescExplore = ViewBindings.findChildViewById(rootView, id);
      if (tvDescExplore == null) {
        break missingId;
      }

      id = R.id.tv_title_explore;
      TextView tvTitleExplore = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleExplore == null) {
        break missingId;
      }

      id = R.id.view_shimmer;
      ShimmerFrameLayout viewShimmer = ViewBindings.findChildViewById(rootView, id);
      if (viewShimmer == null) {
        break missingId;
      }

      return new FragmentExploreBinding((ConstraintLayout) rootView, itemSearch, lottieView,
          rvMovie, tvDescExplore, tvTitleExplore, viewShimmer);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
