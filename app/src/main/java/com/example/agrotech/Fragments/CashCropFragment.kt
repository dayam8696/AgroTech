package com.example.agrotech.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agrotech.databinding.CashCropFragmentBinding

class CashCropFragment : BaseFragment() {
    private val binding by lazy { CashCropFragmentBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

}