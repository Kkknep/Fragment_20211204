package com.nepplus.fragment_20211204.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.fragment_20211204.R
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnGreen.setOnClickListener {
            Toast.makeText(requireContext(), "초록색 토스트메세지", Toast.LENGTH_SHORT).show()
        }
    }
}