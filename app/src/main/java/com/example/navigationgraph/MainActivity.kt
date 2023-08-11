package com.example.navigationgraph

import android.app.Activity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import com.example.navigationgraph.databinding.MainActivityBinding
import com.example.navigationgraph.fragment.GarbageFragment
import com.example.navigationgraph.fragment.HomeFragment
import com.example.navigationgraph.fragment.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : ComponentActivity() {
    private lateinit var binding: MainActivityBinding
    private lateinit var navigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navigationView = binding.bottomNav
        setOnClick()
    }

    private fun setOnClick() {
        navigationView.setOnItemSelectedListener { item ->
            val fragment: Fragment = when (item.itemId) {
                R.id.action_home -> HomeFragment()
                R.id.action_garbage -> GarbageFragment()
                R.id.action_profile -> ProfileFragment()
                else -> HomeFragment()
            }
            true
        }
    }
    private fun displayFragment(fragment: Fragment) {
        Activity.support
    }
}

