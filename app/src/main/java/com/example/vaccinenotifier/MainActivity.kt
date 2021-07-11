package com.example.vaccinenotifier

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.vaccinenotifier.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("PINCODE"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("DISTRICT"))

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

    }
}
