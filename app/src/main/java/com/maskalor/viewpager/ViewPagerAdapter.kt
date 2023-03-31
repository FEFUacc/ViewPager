package com.maskalor.viewpager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fragmentActivity: MainActivity) : FragmentStateAdapter(fragmentActivity) {

    private var list : List<String> = listOf()

    override fun getItemCount(): Int {
        return list.count();
    }

    fun submitList(list : List<String>) {
        this.list = list
    }

    override fun createFragment(position: Int): Fragment {
        return BlankFragment("Тут список тасков из ${list[position]}");
    }
}