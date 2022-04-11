package com.aplen.core.domain.model

import android.os.Parcel
import android.os.Parcelable
import com.aplen.core.utils.Constants.IMAGE_URL

data class Movie(
    var id: Int?,
    var title: String?,
    var voteAverage: Double?,
    var releaseDate: String?,
    var genreIds: List<Int> = emptyList(),
    var genres: List<Genre> = emptyList(),
    var overview: String?,
    var backdropPath: String?,
    var posterPath: String?,
) : Parcelable {

    constructor(
        id: Int?,
        title: String?,
        voteAverage: Double?,
        releaseDate: String?,
        overview: String?,
        backdropPath: String?,
        posterPath: String?,
    ) : this(
        id,
        title,
        voteAverage,
        releaseDate,
        emptyList(),
        emptyList(),
        overview,
        backdropPath,
        posterPath
    )

    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as Int?,
        parcel.readString(),
        parcel.readValue(Double::class.java.classLoader) as Double?,
        parcel.readString(),
        emptyList(),
        emptyList(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
    )

    fun getPosterMovieImage() = IMAGE_URL + posterPath
    fun getBackdropMovieImage() = IMAGE_URL + backdropPath

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeValue(voteAverage)
        parcel.writeString(releaseDate)
        parcel.writeString(overview)
        parcel.writeString(backdropPath)
        parcel.writeString(posterPath)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Movie> {
        override fun createFromParcel(parcel: Parcel): Movie {
            return Movie(parcel)
        }

        override fun newArray(size: Int): Array<Movie?> {
            return arrayOfNulls(size)
        }
    }
}
