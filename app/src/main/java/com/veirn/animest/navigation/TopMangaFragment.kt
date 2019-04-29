package com.veirn.animest.navigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.veirn.animest.Presenter.main.MainPresenterImp
import com.veirn.animest.Presenter.main.MainView
import com.veirn.animest.R
import com.veirn.animest.adapters.MangaAdapter
import com.veirn.animest.di.DaggerMainComponent
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top
import kotlinx.android.synthetic.main.fragment_top_manga.*
import javax.inject.Inject


class TopMangaFragment : Fragment(), MainView {
    override fun getsearchresult(grespon: List<TopAnime>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun getFetcheda(grespon: List<TopAnime>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    @Inject
    lateinit var mainpres : MainPresenterImp
    lateinit var animeAdapter : MangaAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_top_manga, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var component = DaggerMainComponent.create()
        component.inject(this)

        animeAdapter = MangaAdapter(ArrayList(),activity)
        MangaRecycle.adapter = animeAdapter
        MangaRecycle.layoutManager= GridLayoutManager(activity,2)
        MangaRecycle.setHasFixedSize(false)

        mainpres.mainView = this
        mainpres.getTopManga(activity,1)

    }

    override fun getFectched(grespon: List<Top>) {
        Log.d("gsonss",grespon.toString()) // any implementation
        if(progressbar2!=null) {
            progressbar2.visibility = View.INVISIBLE
        }
        animeAdapter.updatelist(grespon)
    }



}
