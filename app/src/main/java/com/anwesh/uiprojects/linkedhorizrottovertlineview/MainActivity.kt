package com.anwesh.uiprojects.linkedhorizrottovertlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.horizrottovertlineview.HorizRotToVertLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        HorizRotToVertLineView.create(this)
    }
}
