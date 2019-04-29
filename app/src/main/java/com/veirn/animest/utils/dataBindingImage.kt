package com.veirn.animest.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.veirn.animest.R

@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, imageUrl: String) {
    Glide.with(view.getContext())
        .load(imageUrl)
        .placeholder(R.drawable.loading)
        .into(view)

}