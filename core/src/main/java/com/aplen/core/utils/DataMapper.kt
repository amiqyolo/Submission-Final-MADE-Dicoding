package com.aplen.core.utils

import com.aplen.core.data.source.local.entity.FavoriteEntity
import com.aplen.core.data.source.remote.response.GenresItem
import com.aplen.core.data.source.remote.response.MovieDetailResponse
import com.aplen.core.data.source.remote.response.MovieResultsItem
import com.aplen.core.domain.model.Genre
import com.aplen.core.domain.model.Movie

object DataMapper {
    fun responseMovieToDomain(movies: List<MovieResultsItem>): List<Movie> {
        val dataArray = ArrayList<Movie>()
        movies.map {
            val data = Movie(
                id = it.id,
                title = it.title,
                voteAverage = it.voteAverage,
                releaseDate = it.releaseDate,
                genreIds = it.genreIds,
                genres = emptyList(),
                overview = it.overview,
                backdropPath = it.backdropPath,
                posterPath = it.posterPath,
            )
            dataArray.add(data)
        }
        return dataArray
    }

    fun entityFavoritesToDomain(favorites: List<FavoriteEntity>): List<Movie> = favorites.map {
        Movie(
            id = it.id,
            title = it.title,
            voteAverage = it.voteAverage,
            releaseDate = it.releaseDate,
            genreIds = emptyList(),
            genres = emptyList(),
            overview = it.overview,
            backdropPath = it.backdropPath,
            posterPath = it.posterPath,
        )
    }

    fun domainToEntityFavorite(movie: Movie): FavoriteEntity = FavoriteEntity(
        movie.id,
        movie.title,
        movie.voteAverage,
        movie.releaseDate,
        movie.overview,
        movie.backdropPath,
        movie.posterPath,
    )

    fun responseDetailToDomain(movie: MovieDetailResponse): Movie {
        val genreList: List<Genre> =
            responseGenresToModels(movie.genres)

        return Movie(
            movie.id,
            movie.title,
            movie.voteAverage,
            movie.releaseDate,
            emptyList(),
            genreList,
            movie.overview,
            movie.backdropPath,
            movie.posterPath,
        )
    }

    private fun responseGenresToModels(genres: List<GenresItem?>): List<Genre> {
        val genreList = mutableListOf<Genre>()
        for (genre in genres) {
            if (genre != null) {
                genreList.add(Genre(genre.id, genre.name))
            }
        }
        return genreList
    }
}