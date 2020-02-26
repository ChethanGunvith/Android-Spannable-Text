package com.chethan.appuapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.chethan.appuapplication.databinding.HomeFragmentBinding
import com.chethan.appuapplication.databinding.PrivacyBinding


/**
 * Created by Chethan on 5/3/2019.
 */


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = HomeFragmentBinding.inflate(inflater, container, false)
        //set binding variables here
        return binding.getRoot()

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    }

}