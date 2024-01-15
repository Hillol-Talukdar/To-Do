package com.hillol.todo.ui.screen.splashScreen

import android.app.Activity
import android.os.Handler
import android.os.Looper
import androidx.lifecycle.ViewModel
import com.hillol.todo.utils.OpenScreenUtils

class SplashScreenViewModel : ViewModel() {
    private var handler = Handler(Looper.getMainLooper())

     fun gotToNextScreen(activity: Activity) {
        handler.postDelayed(Runnable {
            OpenScreenUtils.goToToDoListScreen(activity)
        }, 1000)
    }

}