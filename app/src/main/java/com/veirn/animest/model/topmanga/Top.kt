package com.veirn.animest.model.topmanga

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
var CURRENT_WEATHER_ID = 0

@Entity(tableName = "top_current")
data class Top(
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
    val url: String?,
    @SerializedName("volumes")
    val volumes: Int?// https://myanimelist.net/anime/19/Monster
) : Parcelable     {



    constructor(source: Parcel) : this(
        source.readString(),
        source.readValue(Int::class.java.classLoader) as Int?,
        source.readString(),
        source.readValue(Int::class.java.classLoader) as Int?,
        source.readValue(Int::class.java.classLoader) as Int?,
        source.readValue(Int::class.java.classLoader) as Int?,
        source.readValue(Double::class.java.classLoader) as Double?,
        source.readString(),
        source.readString(),
        source.readString(),
        source.readString(),
        source.readValue(Int::class.java.classLoader) as Int?
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(endDate)
        writeValue(episodes)
        writeString(imageUrl)
        writeValue(malId)
        writeValue(members)
        writeValue(rank)
        writeValue(score)
        writeString(startDate)
        writeString(title)
        writeString(type)
        writeString(url)
        writeValue(volumes)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Top> = object : Parcelable.Creator<Top> {
            override fun createFromParcel(source: Parcel): Top =
                Top(source)
            override fun newArray(size: Int): Array<Top?> = arrayOfNulls(size)
        }
    }

    fun getRank (rank: Int?) : String{
        return String.format("Rank  :$rank")
    }

}
