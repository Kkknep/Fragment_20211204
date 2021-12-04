package com.nepplus.fragment_20211204.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nepplus.fragment_20211204.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment()  {

//    xml을 연결해주는 역할만 담당
    
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first,container,false)
    }
//    액티비티가 완성됐을때 실행할게
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    
        btnToast.setOnClickListener {
            Toast.makeText(requireContext(), "프래그먼트에서 토스트 띄우기", Toast.LENGTH_SHORT).show()
        }
        
        
    }


}