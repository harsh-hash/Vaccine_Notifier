package com.example.vaccinenotifier

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.vaccinenotifier.databinding.PincodeFragmentBinding

class PincodeFragment : Fragment() {

    private lateinit var viewModel: PincodeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<PincodeFragmentBinding>(inflater,R.layout.pincode_fragment,container,false)
        return binding.root
    }

}