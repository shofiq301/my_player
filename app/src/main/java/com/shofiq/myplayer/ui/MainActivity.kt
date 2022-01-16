package com.shofiq.myplayer.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.shofiq.myplayer.R
import com.shofiq.myplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
//        splashScreen.setOnExitAnimationListener(listener = {
//            Toast.makeText(this, "Splash screen over", Toast.LENGTH_SHORT).show()
//        })
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}