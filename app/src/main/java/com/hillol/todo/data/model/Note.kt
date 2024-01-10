package com.hillol.todo.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "note_table")
data class Note(
    @PrimaryKey var uid: Int,
    @ColumnInfo(name = "title") var title: String?,
    @ColumnInfo(name = "description") var description: String?
) : Serializable {

}
