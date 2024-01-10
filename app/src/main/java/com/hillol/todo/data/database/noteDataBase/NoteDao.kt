package com.hillol.todo.data.database.noteDataBase

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.hillol.todo.data.model.Note

@Dao
interface NoteDao {
    @Insert
    fun insert(note: Note)

    @Query("SELECT * FROM note_table")
    fun getAll(): ArrayList<Note>

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)
}