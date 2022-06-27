package com.example.navigationsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationsample.databinding.FragmentFirstBinding
import com.example.navigationsample.databinding.FragmentSecondBinding
import com.example.navigationsample.utils.viewBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val binding by viewBinding(FragmentSecondBinding::bind)
    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvSecondFragment.apply {
            setOnClickListener {
                findNavController().navigate(R.id.fromSecondFragmentToFirstFragment)
            }
            text = args.name
        }

    }
}
