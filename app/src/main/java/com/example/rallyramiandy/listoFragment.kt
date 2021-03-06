package com.example.rallyramiandy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rallyramiandy.databinding.FragmentListoBinding


class listoFragment : Fragment() {
    lateinit var binding: FragmentListoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentListoBinding.inflate(layoutInflater)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.IniciarButton.setOnClickListener {
            val nombraaa= binding.nombraa.text.toString()
            val action = inicioFragmentDirections.actionInicioFragmentToCapturaFragment("${nombraaa}")
            findNavController().navigate(action)
        }

    }

}