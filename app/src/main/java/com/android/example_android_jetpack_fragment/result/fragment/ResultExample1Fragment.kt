package com.android.example_android_jetpack_fragment.result.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.android.example_android_jetpack_fragment.R
import java.lang.ref.WeakReference

class ResultExample1Fragment : Fragment() {

    interface OnCallFatherListener {
        fun talk(s: String): String
    }

    var weakResListener: WeakReference<OnCallFatherListener>? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val listener = context as? OnCallFatherListener ?: throw ClassCastException("you're not my father")
        weakResListener = WeakReference(listener)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_result_example1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.result_example1_fragment_btn_send).setOnClickListener {
            weakResListener?.get()?.talk(view.findViewById<EditText>(R.id.result_example1_fragment_edt_to_activity)?.text?.toString() ?: "")
        }
    }

    fun activityCallFragment(str: String) {
        view?.findViewById<TextView>(R.id.result_example1_fragment_tv_content)?.text = str
    }

}