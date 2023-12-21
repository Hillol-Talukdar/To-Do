package com.hillol.todo.utils

import android.app.Activity
import android.content.Intent
import com.hillol.todo.ui.screen.todoListScreen.ToDoListScreen

object OpenScreenUtils {
    private const val TAG = "OpenScreenUtils"

    fun goToToDoListScreen(activity: Activity) {
        val intent = Intent(activity, ToDoListScreen::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

}