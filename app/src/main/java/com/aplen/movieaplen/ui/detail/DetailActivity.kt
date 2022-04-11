package com.aplen.movieaplen.ui.detail

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ShareCompat
import com.aplen.core.data.Resource
import com.aplen.core.domain.model.Movie
import com.aplen.core.ui.ViewModelFactory
import com.aplen.core.utils.Constants.ELEVATION
import com.aplen.core.utils.Constants.EXTRA_MOVIE
import com.aplen.core.utils.Constants.SUCCESS_INSERT
import com.aplen.core.utils.Constants.SUCCESS_REMOVE
import com.aplen.core.utils.Constants.mimeType
import com.aplen.core.utils.Utility.load
import com.aplen.movieaplen.MyApplication
import com.aplen.movieaplen.R
import com.aplen.movieaplen.databinding.ActivityDetailBinding
import com.google.android.material.chip.Chip
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var type: Movie

    @Inject
    lateinit var factory: ViewModelFactory

    private val viewModel: DetailViewModel by viewModels { factory }

    private var isFavorite = false

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        type = intent.getParcelableExtra<Movie>(EXTRA_MOVIE) as Movie

        viewModel.checkFavorite(type).observe(this) { state ->
            if (state) binding.fabFavorite.setImageResource(R.drawable.ic_favorite)
            else binding.fabFavorite.setImageResource(R.drawable.ic_favorite_border)
            isFavorite = !state
        }

        viewModel.getDetailMovies(type).observe(this) { result ->
            if (result != null) {
                when (result) {
                    is Resource.Loading -> showLoading(true)
                    is Resource.Success -> {
                        showLoading(false)
                        populateMovie(result.data)
                    }
                    is Resource.Error -> {
                        Toast.makeText(this@DetailActivity, result.message, Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }
        }

        setupToolbar()
    }

    private fun addFavorite(data: Movie) {
        viewModel.addToFavorite(data)
        Toast.makeText(this@DetailActivity, SUCCESS_INSERT, Toast.LENGTH_SHORT).show()
    }

    private fun removeFavorite(data: Movie) {
        viewModel.deleteFromFavorite(data)
        Toast.makeText(this@DetailActivity, SUCCESS_REMOVE, Toast.LENGTH_SHORT).show()
    }

    private fun populateMovie(detailMovie: Movie?) {
        binding.apply {
            if (detailMovie != null) {

                imgDetailPoster.load(detailMovie.getPosterMovieImage())
                imgDetailBackdrop.load(detailMovie.getBackdropMovieImage())

                if (detailMovie.title == null) {
                    tvDetailTitle.text = resources.getString(R.string.empty_title)
                } else {
                    tvDetailTitle.text = detailMovie.title
                }

                if (detailMovie.releaseDate == null) {
                    tvDetailRelease.text = resources.getString(R.string.empty_release)
                } else {
                    tvDetailRelease.text = detailMovie.releaseDate
                }

                if (detailMovie.voteAverage != 0.0) {
                    tvDetailRating.text = detailMovie.voteAverage.toString()
                } else {
                    tvDetailRating.text = resources.getString(R.string.empty_vote)
                }

                if (detailMovie.overview == null) {
                    tvDetailOverview.text = resources.getString(R.string.empty_overview)
                } else {
                    tvDetailOverview.text = detailMovie.overview
                }

                cgDetailGenre.apply {
                    for (genre in detailMovie.genres) {
                        val chip = Chip(this@DetailActivity)
                        if (genre.id != 0) {
                            chip.text = genre.name
                        } else {
                            chip.text = resources.getString(R.string.empty_genres)
                        }
                        chip.chipBackgroundColor =
                            getColorStateList(R.color.color_secondary)
                        chip.setTextColor(resources.getColor(android.R.color.white, null))
                        chip.isEnabled = false
                        addView(chip)
                    }
                }

                fabFavorite.setOnClickListener {
                    setFavorite(detailMovie)
                }

            }
        }
    }

    private fun setFavorite(data: Movie) {
        isFavorite = if (isFavorite) {
            binding.fabFavorite.setImageResource(R.drawable.ic_favorite)
            addFavorite(data)
            !isFavorite
        } else {
            binding.fabFavorite.setImageResource(R.drawable.ic_favorite_border)
            removeFavorite(data)
            !isFavorite
        }
    }

    private fun showLoading(isLoading: Boolean) {
        binding.progressBar.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.elevation = ELEVATION
        supportActionBar?.title = null
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_on_shared, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.on_shared) {
            ShareCompat.IntentBuilder(this)
                .setType(mimeType)
                .setChooserTitle(resources.getString(R.string.title_shared))
                .setText(resources.getString(R.string.text_shared))
                .startChooser()
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}