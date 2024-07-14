package com.aplen.core.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aplen.core.databinding.ItemRowMovieBinding
import com.aplen.core.domain.model.Movie
import com.aplen.core.utils.Utility.load
import java.math.RoundingMode

class MovieAdapter :
    ListAdapter<Movie, MovieAdapter.MoviesViewHolder>(MoviesAdapterComparator()) {

    private lateinit var onItemClickCallback: OnItemClickCallBack

    fun setOnItemClickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallback = onItemClickCallBack
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Movie)
    }

    inner class MoviesViewHolder(private val binding: ItemRowMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            binding.apply {
                imgItemPoster.load(movie.getPosterMovieImage())
                tvItemTitle.text = movie.title
                tvItemRating.text = movie.voteAverage?.toBigDecimal()?.setScale(1, RoundingMode.UP).toString()
                tvItemOverview.text = movie.overview
                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(movie)
                }
            }
        }
    }

    class MoviesAdapterComparator : DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(
            oldItem: Movie,
            newItem: Movie,
        ): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(
            oldItem: Movie,
            newItem: Movie,
        ): Boolean =
            oldItem == newItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding =
            ItemRowMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }
}