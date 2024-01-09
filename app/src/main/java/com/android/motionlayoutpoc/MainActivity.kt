package com.android.motionlayoutpoc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNavigate: Button = findViewById(R.id.buttonNavigate)
buttonNavigate.setOnClickListener {

    val intent = Intent(this@MainActivity, MotionLayoutActivity::class.java)

    // If you want to pass data to the second activity, you can use putExtra
    // For example:
    // intent.putExtra("key", "value")

    // Start the SecondActivity
    startActivity(intent)
}
    }
}