// 13-08-2021 Feralldy Andree Sapoetra 10118356
package com.jovanovic.stefan.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}

// 13-08-2021 Feralldy Andree Sapoetra 10118356