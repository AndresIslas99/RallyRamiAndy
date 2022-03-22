package com.example.rallyramiandy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.rallyramiandy.databinding.FragmentCapturaBinding


class capturaFragment : Fragment() {
    lateinit var binding: FragmentCapturaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCapturaBinding.inflate(layoutInflater)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.TituloCaptura.text="${arguments?.getString("nombra")} To Do List"

        binding.AgregarButton.setOnClickListener {
            val Actividad= binding.TituloTask.text.toString()
            val Descripcion= binding.DescriptionText.text.toString()
           // val timeStamp: String = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())

            val action = capturaFragmentDirections.actionCapturaFragmentToListoFragment()
            findNavController().navigate(action)
        }

    }

}