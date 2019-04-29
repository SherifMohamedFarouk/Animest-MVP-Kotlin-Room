package com.veirn.animest.ui.details

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.veirn.animest.databinding.ActivityMangaDetailsBinding
import com.veirn.animest.model.topmanga.Top
import kotlinx.android.synthetic.main.activity_manga_details.*


class MangaDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMangaDetailsBinding = DataBindingUtil. setContentView(this,com.veirn.animest.R.layout.activity_manga_details)

        var text1 = intent.extras!!.getParcelable<Top>("Value1")
        binding.topmanga = text1
        if (text1.score != null) {
            ratingbar.rating = (text1.score!! /2.0).toFloat()
            }
        imageviewdetails.setOnClickListener {
            val browse = Intent(Intent.ACTION_VIEW, Uri.parse(text1.url))

            startActivity(browse)

        }


    }
}
