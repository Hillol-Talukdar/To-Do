package com.hillol.todo.ui.screen.splashScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import com.hillol.todo.R
import com.hillol.todo.ui.screen.splashScreen.ui.theme.ToDoTheme

class SplashScreenView {
    @Composable
    fun OnCreate() {
        SplashScreenUI()
    }

    @Preview(showBackground = true)
    @Composable
    fun SplashScreenUI() {
        ToDoTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                AppIconUI()
            }
        }
    }

    @Composable
    fun AppIconUI(modifier: Modifier = Modifier) {
        ConstraintLayout(modifier = modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                modifier = modifier
                    .fillMaxSize()
                    .background(Color.Black)
            )
        }
    }
}