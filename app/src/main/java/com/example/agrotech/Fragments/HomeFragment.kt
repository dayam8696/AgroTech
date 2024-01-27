package com.example.agrotech.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.agrotech.R

import com.example.agrotech.databinding.HomeFragmentBinding

class HomeFragment: BaseFragment(){
    private val binding by lazy {HomeFragmentBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnhmgrdn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_blogHomeGarden)
        }
        binding.btncashcrp.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_cashCropFragment)
        }

        binding.btnpredict.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_camFragment2)
        }
        binding.btnfertilizer.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment2_to_fertilizerFragment)
        }
    }


}