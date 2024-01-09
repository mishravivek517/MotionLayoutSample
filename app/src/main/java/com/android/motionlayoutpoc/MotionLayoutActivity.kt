package com.android.motionlayoutpoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import com.android.motionlayoutpoc.R.*


class MotionLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_motion_layout)

        val motionLayout = findViewById<MotionLayout>(id.motionLayout)
        motionLayout.setTransitionDuration(2000)

        // Start the transition to the end state

        // Start the transition to the end state
//        motionLayout.transitionToEnd()
    }
}