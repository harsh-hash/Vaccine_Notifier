package com.example.vaccinenotifier

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabLayoutAdapter(private val myContext: Context,fragmentManager: FragmentManager,var totalTabs: Int) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return totalTabs
    }

    override fun getItem(position: Int): Fragment {
        if(position==1)
            return DistrictFragment()
        return PincodeFragment()
    }
}