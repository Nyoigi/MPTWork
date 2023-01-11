package com.example.mptwork.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mptwork.presentation.MainFragment
import com.example.mptwork.R
import com.example.mptwork.utils.extensions.navigateToFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigateToFragment(fragment = MainFragment())
    }
}