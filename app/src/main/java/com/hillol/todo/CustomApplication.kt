package com.hillol.todo

import android.app.Application
import androidx.room.Room
import com.hillol.todo.data.database.noteDataBase.NoteDatabase

class CustomApplication : Application() {
    companion object {
        lateinit var noteDb: NoteDatabase
    }

    override fun onCreate() {
        super.onCreate()
        initDataBase()
    }

    private fun initDataBase() {
        noteDb = Room.databaseBuilder(applicationContext, NoteDatabase::class.java, "note_database")
            .build()
    }
}