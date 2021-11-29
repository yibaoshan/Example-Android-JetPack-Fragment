package com.android.example_android_jetpack_fragment.result.activity

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.example_android_jetpack_fragment.R
import com.android.example_android_jetpack_fragment.result.fragment.ResultExample1Fragment

class ResultExample1Activity : AppCompatActivity(), ResultExample1Fragment.OnCallFatherListener {

    var fragment: ResultExample1Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_example1)
        init()
    }

    private fun init() {
        fragment = ResultExample1Fragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment ?: return).commit()
    }

    fun onSendToFragment(view: View) {
        fragment?.activityCallFragment(findViewById<EditText>(R.id.result_example1_activity_tv_content_edt_to_fragment)?.text?.toString() ?: "")
    }

    override fun talk(s: String): String {
        findViewById<TextView>(R.id.result_example1_activity_tv_content)?.text = s
        return s
    }

}