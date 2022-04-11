package com.aplen.movieaplen.ui.home

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
import com.aplen.movieaplen.databinding.FragmentHomeBinding
import com.aplen.movieaplen.ui.detail.DetailActivity
import javax.inject.Inject

class HomeFragment : Fragment() {

    private lateinit var adapter: MovieAdapter

    @Inject
    lateinit var factory: ViewModelFactory

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding

    private val homeViewModel: HomeViewModel by viewModels { factory }

    private var lottieImageError: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        (requireActivity().application as MyApplication).appComponent.inject(this)

        lottieImageError = resources.getIdentifier("errorbox", "raw", activity?.packageName)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            adapter = MovieAdapter()

            homeViewModel.movies.observe(viewLifecycleOwner) { result ->
                if (result != null) {
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

            binding?.rvMovie?.layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            binding?.rvMovie?.setHasFixedSize(true)
            binding?.rvMovie?.adapter = adapter

            adapter.setOnItemClickCallBack(object :
                MovieAdapter.OnItemClickCallBack {
                override fun onItemClicked(data: Movie) {
                    startActivity(Intent(requireContext(), DetailActivity::class.java).apply {
                        putExtra(EXTRA_MOVIE, data)
                    })
                }
            })
        }
    }

    private fun showEmptyView(isEmpty: Boolean) {
        if (isEmpty) {
            binding?.lottieViewBox?.visible()
            binding?.tvTitleBox?.visible()
        } else {
            binding?.lottieViewBox?.gone()
            binding?.tvTitleBox?.gone()
        }
    }

    private fun showErrorView(isError: Boolean, message: String?) {
        if (isError) {
            binding?.lottieViewBox?.setAnimation(lottieImageError)
            binding?.tvTitleBox?.text = message
            binding?.lottieViewBox?.visible()
            binding?.tvTitleBox?.visible()
        } else {
            binding?.lottieViewBox?.gone()
            binding?.tvTitleBox?.gone()
        }
    }

    private fun showRecyclerView(isRecycler: Boolean) {
        if (isRecycler) binding?.rvMovie?.visible() else binding?.rvMovie?.gone()
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading) binding?.viewShimmer?.visible() else binding?.viewShimmer?.gone()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding?.rvMovie?.adapter = null
        _binding = null
    }
}