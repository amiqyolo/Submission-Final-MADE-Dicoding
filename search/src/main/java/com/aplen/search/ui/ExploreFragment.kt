package com.aplen.search.ui

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplen.core.data.Resource
import com.aplen.core.domain.model.Movie
import com.aplen.core.ui.MovieAdapter
import com.aplen.core.ui.ViewModelFactory
import com.aplen.core.utils.Constants.EXTRA_MOVIE
import com.aplen.core.utils.Utility.gone
import com.aplen.core.utils.Utility.visible
import com.aplen.movieaplen.MyApplication
import com.aplen.movieaplen.ui.detail.DetailActivity
import com.aplen.search.R
import com.aplen.search.databinding.FragmentExploreBinding
import com.aplen.search.di.DaggerExploreComponent
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@SuppressLint("CheckResult")
class ExploreFragment : Fragment() {

    private lateinit var adapter: MovieAdapter

    @Inject
    lateinit var factory: ViewModelFactory

    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding

    private val exploreViewModel: ExploreViewModel by viewModels { factory }

    private var lottieImageEmpty: Int = 0
    private var lottieImageError: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentExploreBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val appComponent = (requireActivity().application as MyApplication).appComponent
        DaggerExploreComponent.factory().create(appComponent).inject(this)

        lottieImageEmpty = resources.getIdentifier("emptybox", "raw", activity?.packageName)
        lottieImageError = resources.getIdentifier("errorbox", "raw", activity?.packageName)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            adapter = MovieAdapter()

            exploreViewModel.searchResult(binding?.itemSearch)
                .debounce(1500, TimeUnit.MILLISECONDS)
                .filter { text -> text.isNotEmpty() && text.length >= 3 }
                .map { text -> text.lowercase().trim() }
                .distinctUntilChanged()
                .flatMap { Flowable.just(it) }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ text ->
                    observeExplore(text, view)
                }, {
                    println(it)
                })

            binding?.rvMovie?.layoutManager = LinearLayoutManager(context)
            binding?.rvMovie?.setHasFixedSize(true)
            binding?.rvMovie?.adapter = adapter

            adapter.setOnItemClickCallBack(object : MovieAdapter.OnItemClickCallBack {
                override fun onItemClicked(data: Movie) {
                    startActivity(Intent(
                        requireContext(),
                        DetailActivity::class.java
                    ).apply {
                        putExtra(EXTRA_MOVIE, data)
                    })
                }
            })
        }
    }

    private fun observeExplore(text: String, view: View?) {
        if (view != null) {
            exploreViewModel.exploreMovie(text).observe(viewLifecycleOwner) { result ->
                when (result) {
                    is Resource.Error -> {
                        showLoading(false)
                        showRecyclerView(false)
                        showEmptyView(false)
                        showErrorView(true, result.message)
                    }
                    is Resource.Loading -> {
                        showEmptyView(false)
                        showRecyclerView(false)
                        showErrorView(false, null)
                        showLoading(true)
                    }
                    is Resource.Success -> {
                        if (result.data?.isNotEmpty() == true) {
                            adapter.submitList(result.data)
                            showEmptyView(false)
                            showLoading(false)
                            showErrorView(false, null)
                            showRecyclerView(true)
                        } else {
                            showRecyclerView(false)
                            showLoading(false)
                            showErrorView(false, null)
                            showEmptyView(true)
                        }
                    }
                }
            }
        }
    }

    private fun showEmptyView(isEmpty: Boolean) {
        if (isEmpty) {
            binding?.apply {
                binding?.lottieView?.setAnimation(lottieImageEmpty)
                tvTitleExplore.text =
                    resources.getString(R.string.no_data)
                lottieView.visible()
                tvTitleExplore.visible()
            }
        } else {
            binding?.apply {
                lottieView.gone()
                tvTitleExplore.gone()
            }
        }
    }

    private fun showErrorView(isError: Boolean, message: String?) {
        if (isError) {
            binding?.lottieView?.setAnimation(lottieImageError)
            binding?.tvTitleExplore?.text = message
            binding?.lottieView?.visible()
            binding?.tvTitleExplore?.visible()
        } else {
            binding?.lottieView?.gone()
            binding?.tvTitleExplore?.gone()
        }
    }

    private fun showRecyclerView(isRecycler: Boolean) {
        if (isRecycler) binding?.rvMovie?.visible() else binding?.rvMovie?.gone()
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading) binding?.viewShimmer?.visible() else binding?.viewShimmer?.gone()
    }

    override fun onResume() {
        exploreViewModel.searchResult(binding?.itemSearch)
            .debounce(1500, TimeUnit.MILLISECONDS)
            .filter { text -> text.isNotEmpty() && text.length >= 3 }
            .map { text -> text.lowercase().trim() }
            .distinctUntilChanged()
            .flatMap { Flowable.just(it) }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ text ->
                observeExplore(text, view)
            }, {
                println(it)
            })
        super.onResume()
    }

    override fun onDestroyView() {
        binding?.rvMovie?.adapter = null
        _binding = null
        super.onDestroyView()
    }
}