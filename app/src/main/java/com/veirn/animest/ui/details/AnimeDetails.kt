package com.veirn.animest.ui.details

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import com.veirn.animest.Presenter.details.DetailsPersenterImpl
import com.veirn.animest.Presenter.details.DetailsView
import com.veirn.animest.R
import com.veirn.animest.di.DaggerMainComponent
import com.veirn.animest.model.topanime.animedetails.TopAnimeDetails
import kotlinx.android.synthetic.main.activity_anime_details.*
import javax.inject.Inject

class AnimeDetails : AppCompatActivity(),DetailsView {
@Inject
lateinit var detailsPersenter: DetailsPersenterImpl
lateinit var binding : com.veirn.animest.databinding.ActivityAnimeDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = DataBindingUtil. setContentView(this,com.veirn.animest.R.layout.activity_anime_details)
        var text = intent.extras!!.getInt("Value")


        var component = DaggerMainComponent.create()
        component.inject(this)
        detailsPersenter.detailsView = this
        detailsPersenter.getDetailsAnime(this,text)

    }
    override fun getondata(grespon: TopAnimeDetails) {
        Log.d("detailsc",grespon.toString())
        binding.detailsanime =  grespon
        if (grespon.score != null) {
            ratingbar1.rating = (grespon.score!! /2.0).toFloat()
        }
        if (grespon.imageUrl != null) {
            Glide.with(this)
                .load(grespon.imageUrl)
                .placeholder(R.drawable.loading)
                .into(topAnimeImage)
        }
        if (grespon.url != null) {
        imageviewdetails.setOnClickListener {
            val browse = Intent(Intent.ACTION_VIEW, Uri.parse(grespon.url))

            startActivity(browse)
        }
        }
        if(progressbar1!=null) {
            progressbar1.visibility = View.INVISIBLE
        }

    }
}
