package com.hillol.todo.data.database.noteDataBase

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hillol.todo.data.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase() : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}
