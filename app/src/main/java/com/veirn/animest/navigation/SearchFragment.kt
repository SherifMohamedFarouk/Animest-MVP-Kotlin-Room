package com.veirn.animest.navigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.veirn.animest.Presenter.main.MainPresenterImp
import com.veirn.animest.Presenter.main.MainView
import com.veirn.animest.R
import com.veirn.animest.adapters.AnimeAdapter
import com.veirn.animest.di.DaggerMainComponent
import com.veirn.animest.model.topanime.TopAnime
import com.veirn.animest.model.topmanga.Top
import kotlinx.android.synthetic.main.fragment_search.*
import javax.inject.Inject

class SearchFragment : Fragment(),SearchView.OnQueryTextListener, MainView {
    @Inject
    lateinit var mainpres : MainPresenterImp
    lateinit var searchAdapter: AnimeAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       searchview.setOnQueryTextListener(this)
        var component = DaggerMainComponent.create()
        component.inject(this)


        searchAdapter = AnimeAdapter(ArrayList(),activity)
        searchRecycle.adapter = searchAdapter
        searchRecycle.layoutManager= LinearLayoutManager(activity)
        searchRecycle.setHasFixedSize(false)

        mainpres.mainView = this


    }
    override fun onQueryTextSubmit(query: String): Boolean {
        searchAdapter.clearlist()
        mainpres.getSearch(query,activity,1)

            progressbar2.visibility = View.VISIBLE

        return true
    }
    override fun getsearchresult(grespon: List<TopAnime>) {
        Log.d("gsonss",grespon.toString()) // any implementation
        if(progressbar2!=null) {
            progressbar2.visibility = View.INVISIBLE
        }
        searchAdapter.updatelist(grespon)
    }

    override fun onQueryTextChange(newText: String?): Boolean {
      return true
    }
    override fun getFectched(grespon: List<Top>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getFetcheda(grespon: List<TopAnime>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
