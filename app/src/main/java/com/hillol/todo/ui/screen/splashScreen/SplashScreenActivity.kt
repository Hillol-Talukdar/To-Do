package com.hillol.todo.ui.screen.splashScreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels

class SplashScreenActivity : ComponentActivity() {
    private val splashScreenView = SplashScreenView()
    private val viewModel : SplashScreenViewModel by  viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            splashScreenView.OnCreate()
        }

        viewModel.gotToNextScreen(this)
    }
}