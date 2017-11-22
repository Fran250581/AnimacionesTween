package com.example.fran.animacionestween

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val texto = findViewById<View>(R.id.textView) as TextView
        val animacion = AnimationUtils.loadAnimation(this, R.anim.animacion)
        texto.startAnimation(animacion)
    }
}
