package com.android.example_android_jetpack_fragment.result.activity

import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.android.example_android_jetpack_fragment.R
import com.android.example_android_jetpack_fragment.result.viewmodel.ResultViewModel

class ResultExample2Activity : AppCompatActivity() {

    private val viewModel: ResultViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "通信-ViewModel"
        setContentView(R.layout.activity_result_example2)
        viewModel.resultLiveData.observe(this, { str ->
            findViewById<TextView>(R.id.tv_content).text = str
        })
    }

}