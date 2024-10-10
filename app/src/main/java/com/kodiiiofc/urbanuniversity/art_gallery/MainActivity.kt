package com.kodiiiofc.urbanuniversity.art_gallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var adapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ViewPagerAdapter(this, Picture.pictures)
        viewPager = findViewById(R.id.vp2_gallery)
        viewPager.adapter = adapter

    }
}