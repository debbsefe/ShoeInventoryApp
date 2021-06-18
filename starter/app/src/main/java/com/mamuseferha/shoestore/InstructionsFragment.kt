package com.mamuseferha.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.mamuseferha.shoestore.databinding.FragmentInstructionsBinding


class InstructionsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instructions, container, false
        )
        binding.idShoesDestination.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_instructionsFragment_to_shoeListFragment)
        )
        return binding.root
    }


}