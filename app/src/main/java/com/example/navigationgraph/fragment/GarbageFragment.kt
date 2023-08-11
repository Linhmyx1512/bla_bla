package com.example.navigationgraph.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationgraph.databinding.FragmentGarbageBinding

class GarbageFragment : Fragment() {
    private lateinit var binding: FragmentGarbageBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGarbageBinding.inflate(inflater, container, false)
        return binding.root
    }


}