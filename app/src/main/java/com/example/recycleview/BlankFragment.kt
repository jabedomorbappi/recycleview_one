package com.example.recycleview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.recycleview.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    private lateinit var binding:FragmentBlankBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        binding=FragmentBlankBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentText.text="This text is located in fragment"

        binding.apply {
            fragmentText2.text="this text applied by binding.apply()"
        }

    }


}