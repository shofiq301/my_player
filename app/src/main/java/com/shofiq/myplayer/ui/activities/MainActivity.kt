package com.shofiq.myplayer.ui.activities

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


        setupNavigation()
    }

    private fun setupNavigation() {
        val navHostFreagment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFreagment.findNavController()

        val appbarCOnfigation =  AppBarConfiguration(setOf(R.id.allVideosFragment, R.id.allFoldersFragment))
        setupActionBarWithNavController(navController, appbarCOnfigation)
        binding.bottomNav.setupWithNavController(navController)
    }
}