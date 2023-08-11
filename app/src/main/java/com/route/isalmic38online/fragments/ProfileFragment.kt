package com.route.isalmic38online.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {
    lateinit var profileBinding: FragmentProfileBinding
    // When Creating a new view
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileBinding = FragmentProfileBinding.inflate(layoutInflater)
        return profileBinding.root
    }
    // When Binding Data and onClickListeners -> ()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}