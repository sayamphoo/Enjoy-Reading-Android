package com.sayamphoo.enjoyreading.ui.frament.book.ui.fragment.comedy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.sayamphoo.enjoyreading.R

/**
 * A simple [Fragment] subclass.
 */
class ComedyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_comedy, container, false)
    }

}
