package com.veirn.animest.model.topanime

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

var CURRENT_WEATHER_ID = 0

@Entity(tableName = "topAnime")
data class TopAnime(
    @SerializedName("end_date")
    val endDate: String?, // Sep 2005
    @SerializedName("episodes")
    val episodes: Int?, // 74
    @SerializedName("image_url")
    val imageUrl: String?, // https://cdn.myanimelist.net/images/anime/10/18793.jpg?s=08c4f10a101c3835eeb14ca0715512bd
    @SerializedName("mal_id")
    val malId: Int?, // 19
    @SerializedName("members")
    val members: Int?, // 411679
  @PrimaryKey(autoGenerate = false)
    @SerializedName("rank")
    val rank: Int?, // 50
    @SerializedName("score")
    val score: Double?, // 8.69
    @SerializedName("start_date")
    val startDate: String?, // Apr 2004
    @SerializedName("title")
    val title: String?, // Monster
    @SerializedName("type")
    val type: String?, // TV
    @SerializedName("url")
    val url: String?

)