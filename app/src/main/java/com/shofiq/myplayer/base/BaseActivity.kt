package com.shofiq.myplayer.base

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<T: ViewBinding, V: ViewModel>: AppCompatActivity() {
}