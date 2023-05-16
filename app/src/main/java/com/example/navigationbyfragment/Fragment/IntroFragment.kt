package com.example.navigationbyfragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationbyfragment.R
import com.example.navigationbyfragment.databinding.FragmentIntroBinding

class IntroFragment : Fragment() {
    private var binding:FragmentIntroBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // in here you can do logic when backPress is clicked
                requireActivity().finish()
                onDestroy()
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentIntroBinding.inflate(LayoutInflater.from(context),container,false)

        binding?.btnstart?.setOnClickListener {
            findNavController().navigate(R.id.homeFragment)
        }

        return binding?.root
    }


}