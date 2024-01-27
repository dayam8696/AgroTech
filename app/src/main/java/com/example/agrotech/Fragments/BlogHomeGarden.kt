package com.example.agrotech.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.agrotech.R
import com.example.agrotech.databinding.HomeGardenBinding

class BlogHomeGarden :BaseFragment() {
    private val binding by lazy { HomeGardenBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnrotational.setOnClickListener {
            findNavController().navigate(R.id.action_blogHomeGarden_to_exploreHomeGardenFragment)
        }
    }

}