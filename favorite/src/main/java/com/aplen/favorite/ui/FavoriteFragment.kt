package com.aplen.favorite.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.aplen.core.domain.model.Movie
import com.aplen.core.ui.MovieAdapter
import com.aplen.core.ui.ViewModelFactory
import com.aplen.core.utils.Constants.EXTRA_MOVIE
import com.aplen.core.utils.Utility.gone
import com.aplen.core.utils.Utility.visible
import com.aplen.favorite.databinding.FragmentFavoriteBinding
import com.aplen.favorite.di.DaggerFavoriteComponent
import com.aplen.movieaplen.MyApplication
import com.aplen.movieaplen.ui.detail.DetailActivity
import javax.inject.Inject

class FavoriteFragment : Fragment() {

    private lateinit var adapter: MovieAdapter

    @Inject
    lateinit var factory: ViewModelFactory

    private var _binding: FragmentFavoriteBinding? = null
    private val binding get() = _binding

    private val viewModel: FavoriteViewModel by viewModels { factory }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentFavoriteBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val appComponent = (requireActivity().application as MyApplication).appComponent
        DaggerFavoriteComponent.factory().create(appComponent).inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            adapter = MovieAdapter()

            viewModel.favorite.observe(viewLifecycleOwner) { result ->
                if (result.isNotEmpty()) {
                    adapter.submitList(result)
                    showEmptyView(false)
                    showRecyclerView(true)
                } else {
                    showRecyclerView(false)
                    showEmptyView(true)
                }
            }

            binding?.rvFavorite?.layoutManager = LinearLayoutManager(requireContext())
            binding?.rvFavorite?.setHasFixedSize(true)
            binding?.rvFavorite?.adapter = adapter

            adapter.setOnItemClickCallBack(object : MovieAdapter.OnItemClickCallBack {
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
            binding?.apply {
                lottieViewBox.visible()
                tvTitleBox.visible()
            }
        } else {
            binding?.apply {
                lottieViewBox.gone()
                tvTitleBox.gone()
            }
        }
    }

    private fun showRecyclerView(isRecycler: Boolean) {
        if (isRecycler) binding?.rvFavorite?.visible() else binding?.rvFavorite?.gone()
    }

    override fun onDestroyView() {
        binding?.rvFavorite?.adapter = null
        _binding = null
        super.onDestroyView()
    }
}