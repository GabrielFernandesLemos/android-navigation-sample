package com.example.navigationsample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationsample.databinding.FragmentFirstBinding
import com.example.navigationsample.utils.viewBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    private val binding by viewBinding(FragmentFirstBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvFirstFragment.setOnClickListener {
            //TODO
        }

    }

}