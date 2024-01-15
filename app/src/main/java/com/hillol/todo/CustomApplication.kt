package com.hillol.todo

import android.app.Application
import android.util.Log
import androidx.room.Room
import com.hillol.todo.data.database.noteDataBase.NoteDatabase
import kotlin.math.log

class CustomApplication : Application() {
    companion object {
        private const val TAG = "CustomApplication"
        lateinit var noteDb: NoteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        initDataBase()
    }

    private fun initDataBase() {
        try {
            noteDb =
                Room.databaseBuilder(applicationContext, NoteDatabase::class.java, "note_database")
                    .build()
        } catch (ex: Exception) {
            Log.e(TAG, "initDataBase: ", ex)
        }
    }
}