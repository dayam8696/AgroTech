package com.example.agrotech.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.agrotech.databinding.LoginFragmentBinding
import com.example.agrotech.databinding.SignupFragmentBinding
import com.google.firebase.auth.FirebaseAuth

class SignUpFragment:BaseFragment() {
    private val binding by lazy { SignupFragmentBinding.inflate(layoutInflater) }
    private lateinit var firebaseAuth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}