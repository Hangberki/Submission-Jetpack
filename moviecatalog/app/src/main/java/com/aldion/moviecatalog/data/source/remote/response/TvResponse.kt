package com.aldion.moviecatalog.data.source.remote.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvResponse(

    @field:SerializedName("first_air_date")
    val firstAirDate: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("vote_average")
    val voteAverage: Double,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("poster_path")
    val posterPath: String,
) : Parcelable
