package com.example.agrotech.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.agrotech.R
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

        super.onViewCreated(view, savedInstanceState)
        firebaseAuth = FirebaseAuth.getInstance()
        binding.Alreadyuser.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment2_to_logInFragment2)
        }

        binding.btnsignUp.setOnClickListener {
            val email = binding.EmailAddress.text.toString()
            val pass = binding.TextPassword.text.toString()
            val confirmpass = binding.reTextPassword.text.toString()

            if (email.isNotEmpty() && pass.isNotEmpty() && confirmpass.isNotEmpty()) {
                if (pass == confirmpass) {
                    firebaseAuth.createUserWithEmailAndPassword(email, pass)
                        .addOnCompleteListener() {
                            if (it.isSuccessful) {
                                findNavController().navigate(R.id.action_signUpFragment2_to_logInFragment2)
                            } else {
                                showToast(it.exception.toString())
                            }
                        }
                } else {
                    showToast("Password is not Matching")
                }
            } else {
                showToast("Empty fields are not allowed")
            }
        }
    }
}