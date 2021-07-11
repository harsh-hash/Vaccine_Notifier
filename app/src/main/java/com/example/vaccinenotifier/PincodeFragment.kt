package com.example.vaccinenotifier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.vaccinenotifier.databinding.PincodeFragmentBinding

class PincodeFragment : Fragment() {

    private lateinit var viewModel: PincodeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<PincodeFragmentBinding>(
            inflater,
            R.layout.pincode_fragment,
            container,
            false
        )

        binding.showCenters.setOnClickListener(View.OnClickListener {

        })
        return binding.root
    }

}