package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
val binding=FragmentProfileBinding.inflate(inflater,container,false)
        binding.cabinet.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container2,CabinetFragment())
                .commit()
        }
        binding.order.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.container2,OrderFragment())
                .commit()
        }
        return binding.root
    }

}