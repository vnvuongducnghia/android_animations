package com.example.androidanimation

import android.animation.ObjectAnimator
import android.graphics.Path
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Move 1
        val path = Path()
        path.moveTo(500f, 500f)
        path.lineTo(500f, 100f)
        path.setLastPoint(0f, 0f)
        path.close()
        val pathAnimator = ObjectAnimator.ofFloat(imgAM, "x", "y", path)


        // Move 2
        val animMove = AnimationUtils.loadAnimation(applicationContext, R.anim.scm_capture)



        btnMove.setOnClickListener {
//            imgAM.startAnimation(animMove)
            pathAnimator.duration = 3000
            pathAnimator.start()
        }
    }
}

internal class Pt(var x: Float, var y: Float)
