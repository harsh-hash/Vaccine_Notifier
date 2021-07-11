package com.example.vaccinenotifier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.vaccinenotifier.Model.CenterList
import com.example.vaccinenotifier.Model.DistrictLists
import com.example.vaccinenotifier.Model.States
import com.example.vaccinenotifier.databinding.DistrictFragmentBinding
import retrofit2.Call

class DistrictFragment : Fragment() {


    private lateinit var viewModel: DistrictViewModel
    lateinit var binding: DistrictFragmentBinding

    lateinit var districtLists: Call<DistrictLists>
    lateinit var centerList: Call<CenterList>
    lateinit var stateLists: Call<States>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.district_fragment, container, false)

        return binding.root
    }

}