package com.octaedge.daggersimpleproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.octaedge.daggersimpleproject.model.BangladeshCricketTeam
import com.octaedge.daggersimpleproject.R
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //field injection
    @Inject
    lateinit var bangladeshCricketTeam: BangladeshCricketTeam

    override fun onCreate(savedInstanceState: Bundle?) {
        //Activity injection
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetMyTeam.setOnClickListener(View.OnClickListener {
            tvPlayerName.text = bangladeshCricketTeam.getMyBestEleven()
        })
    }
}