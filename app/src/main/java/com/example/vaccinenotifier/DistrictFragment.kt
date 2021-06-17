package com.example.vaccinenotifier

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.vaccinenotifier.databinding.DistrictFragmentBinding

class DistrictFragment : Fragment() {


    private lateinit var viewModel: DistrictViewModel
    lateinit var binding : DistrictFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
            binding = DataBindingUtil.inflate(inflater,R.layout.district_fragment,container,false)
            return binding.root
    }

}