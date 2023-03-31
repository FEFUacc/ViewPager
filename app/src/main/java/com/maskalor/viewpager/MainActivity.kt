package com.maskalor.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val list = mutableListOf<String>()
        list.add("Избранные")
        list.add("Навежное")

        list.add("Избранные")
        list.add("Навежное")
        list.add("Избранные")
        list.add("Навежное")
        list.add("Избранные")
        list.add("Навежное")
        list.add("Избранные")
        list.add("Навежное")
        list.add("Избранные")
        list.add("Навежное")


        val vp = findViewById<ViewPager2>(R.id.vp)
        val adapter = ViewPagerAdapter(this)

        adapter.submitList(list)

        vp.adapter = adapter


        val tb = findViewById<TabLayout>(R.id.tabLayout)


        TabLayoutMediator(tb, vp, { tab, pos ->
            tab.text = list[pos]
        }).attach()

        val tab = tb.newTab().setText("+")
        tb.addTab(tab, 0)
    }
}

