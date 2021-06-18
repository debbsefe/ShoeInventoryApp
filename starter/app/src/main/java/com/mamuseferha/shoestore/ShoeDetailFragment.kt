package com.mamuseferha.shoestore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.mamuseferha.shoestore.databinding.FragmentShoeDetailBinding
import com.mamuseferha.shoestore.models.Shoe


class ShoeDetailFragment : Fragment() {
    private val viewModel: ShoeListViewModel by activityViewModels()
    private lateinit var binding: FragmentShoeDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_detail, container, false)
        binding.shoeListViewModel = viewModel


        binding.idSaveShoeDetail.setOnClickListener {

            viewModel.addShoe(
                Shoe(
                    binding.editTextShoeName.text.toString(),
                    binding.editTextShoeSize.text.toString().toDouble(),
                    binding.editTextCompany.text.toString(),
                    binding.editTextDescription.text.toString()
                )
            )
            view?.findNavController()
                ?.navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())

        }

        binding.idCancel.setOnClickListener {
            view?.findNavController()
                ?.navigate(ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment())
        }

        return binding.root
    }


}