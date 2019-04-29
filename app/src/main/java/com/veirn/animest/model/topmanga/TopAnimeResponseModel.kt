package com.veirn.animest.model.topmanga

import androidx.room.Entity
import com.google.gson.annotations.SerializedName
@Entity
data class TopAnimeResponseModel(
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int, // 34658
    @SerializedName("request_cached")
    val requestCached: Boolean, // true
    @SerializedName("request_hash")
    val requestHash: String, // request:top:58399c95e55435d6ccef63eef7ce609974e4f2d5
    @SerializedName("top")
    val top: List<Top>
)