package com.veirn.animest.navigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.veirn.animest.Presenter.main.MainPresenterImp
import com.veirn.animest.Presenter.main.MainView
import com.veirn.animest.adapters.AnimeAdapter
import com.veirn.animest.di.DaggerMainComponent
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top
import com.veirn.animest.utils.PaginationScrollListener
import kotlinx.android.synthetic.main.fragment_top_anime.*
import javax.inject.Inject


class TopAnimeFragment : Fragment() , MainView {
    @Inject
    lateinit var mainpres: MainPresenterImp
    lateinit var animeAdapter : AnimeAdapter
    var isLastPage: Boolean = false
    var isLoading: Boolean = false
    var page : Int = 1

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { // Inflate the layout for this fragment


        return inflater.inflate(com.veirn.animest.R.layout.fragment_top_anime, container, false)


    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var component = DaggerMainComponent.create()
        component.inject(this)


        animeAdapter = AnimeAdapter(ArrayList(),activity)
        AnimeRecycle.adapter = animeAdapter
        AnimeRecycle.layoutManager= GridLayoutManager(activity,2)
        AnimeRecycle.setHasFixedSize(false)
        mainpres.mainView = this
        mainpres.getTopAnime(activity,page++)

        AnimeRecycle.addOnScrollListener(object : PaginationScrollListener( AnimeRecycle.layoutManager as GridLayoutManager ) {
            override fun isLastPage(): Boolean {
                return isLastPage
            }

            override fun isLoading(): Boolean {
                return isLoading
            }

            override fun loadMoreItems() {
                isLoading = true
                getMoreItems()
            }
        })




    }

    fun getMoreItems() {
        mainpres.getTopAnime(activity,page++)
        isLoading = false

        animeAdapter.notifyDataSetChanged()

    }

    override fun getFectched(grespon: List<Top>) {
//        Log.d("gsonss",grespon.toString()) // any implementation
//        if(progressbar1!=null) {
//            progressbar1.visibility = INVISIBLE
//        }
//        animeAdapter.updatelist(grespon)
    }
    override fun getFetcheda(grespon: List<TopAnime>) {
        Log.d("gsonss",grespon.toString()) // any implementation
        if(progressbar1!=null) {
            progressbar1.visibility = INVISIBLE
        }
        animeAdapter.updatelist(grespon)
    }

    override fun getsearchresult(grespon: List<TopAnime>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
