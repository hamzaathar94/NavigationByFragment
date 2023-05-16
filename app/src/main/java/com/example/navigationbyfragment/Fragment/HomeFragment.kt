package com.example.navigationbyfragment.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.findNavController
import com.example.navigationbyfragment.R
import com.example.navigationbyfragment.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var binding:FragmentHomeBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(LayoutInflater.from(context),container,false)
//        binding?.btnstart1?.setOnClickListener {
//            findNavController().navigate(R.id.productFragment)
//        }
        return binding?.root
    }


}