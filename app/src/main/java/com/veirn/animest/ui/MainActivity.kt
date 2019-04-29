package com.veirn.animest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.veirn.animest.Presenter.main.MainPresenterImp
import com.veirn.animest.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class  MainActivity : AppCompatActivity()   {
    @Inject lateinit var mainpres: MainPresenterImp
    lateinit var  navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        bottom_nav.setupWithNavController(navController)
//        mainpres.x.observe(this, Observer {  })

    }








}
