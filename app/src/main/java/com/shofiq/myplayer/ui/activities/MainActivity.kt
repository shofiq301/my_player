package com.shofiq.myplayer.ui.activities

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.shofiq.myplayer.R
import com.shofiq.myplayer.databinding.ActivityMainBinding
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.ActionBar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
//        splashScreen.setOnExitAnimationListener(listener = {
////            Toast.makeText(this, "Splash screen over", Toast.LENGTH_SHORT).show()
//        })
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupNavigation()

    }

    private fun setupNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
        val actionBar: ActionBar? = supportActionBar
        actionBar!!.elevation = 10f
        binding.bottomNav.setupWithNavController(navController)
    }
}