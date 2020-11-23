package com.example.tugas7


import com.example.tugas7.databinding.FragmentBenarBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
class GameWonFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding: FragmentBenarBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_benar, container, false)
        binding.nextMatchButton.setOnClickListener { view: View ->
            view.findNavController().
                navigate(R.id.action_gameWonFragment_to_homeFragment)
        }
        return binding.root
    }
}
