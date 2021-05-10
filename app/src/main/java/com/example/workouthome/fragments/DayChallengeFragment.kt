package com.example.workouthome.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.workouthome.R
import com.example.workouthome.databinding.FragmentDayChallengeBinding

class DayChallengeFragment : Fragment(R.layout.fragment_day_challenge) {

    private  var _binding: FragmentDayChallengeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDayChallengeBinding.inflate(inflater, container, false)
        return binding.root
    }

}