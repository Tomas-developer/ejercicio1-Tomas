package com.tomdeveloper.ejercicio1.home_activity.inicio.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tomdeveloper.ejercicio1.R
import com.tomdeveloper.ejercicio1.databinding.FragmentInicioBinding

class FragmentInicio: Fragment() {

    var binding: FragmentInicioBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.btnlist.let {
            it?.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentInicio_to_fragmentList)
            }
        }

        binding?.btnprofile.let {
            it?.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentInicio_to_fragmentProfile)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInicioBinding.inflate(inflater)
        return binding?.root
    }
}