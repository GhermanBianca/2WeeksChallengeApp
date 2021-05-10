package com.example.workouthome.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.workouthome.R
import com.example.workouthome.adapters.ChallengeAdapter
import com.example.workouthome.databinding.FragmentChallengeBinding
import com.example.workouthome.modules.ChallengeItem

class ChallengeFragment : Fragment(R.layout.fragment_challenge) {

    private var challengeItem: ArrayList<ChallengeItem>? = null
    private var challengeAdapter : ChallengeAdapter? = null
    private var gridLayoutManagerNutrition: GridLayoutManager? = null

    private  var _binding: FragmentChallengeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChallengeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        gridLayoutManagerNutrition = GridLayoutManager(requireContext(), 2, LinearLayoutManager.VERTICAL, false)

        _binding?.challengeRv?.layoutManager = gridLayoutManagerNutrition
        _binding?.challengeRv?.setHasFixedSize(true)

        challengeItem = ArrayList()
        challengeItem = setChallengeList()
        challengeAdapter = ChallengeAdapter(activity, challengeItem!!)
        _binding?.challengeRv?.adapter = challengeAdapter
    }

    private fun setChallengeList() : ArrayList<ChallengeItem> {
        val challengeArrayList: ArrayList<ChallengeItem> = ArrayList()

        challengeArrayList.add(ChallengeItem("Ziua 1 - Fesieri și Abdomen", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 2 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 3 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 4 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 5 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 6 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 7 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 8 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 9 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 10 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 11 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 12 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 13 - Cardio", R.drawable.fesieri))
        challengeArrayList.add(ChallengeItem("Ziua 14 - Cardio", R.drawable.fesieri))

        return challengeArrayList
    }
}