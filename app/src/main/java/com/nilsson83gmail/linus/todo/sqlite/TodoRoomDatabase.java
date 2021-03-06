package com.nilsson83gmail.linus.todo.sqlite;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.nilsson83gmail.linus.todo.dataAccessObjects.TodoDao;
import com.nilsson83gmail.linus.todo.models.Todo;

/**
 * Created by s060qm on 3/19/2018.
 */

@Database(entities = {Todo.class}, version = 1)
public abstract class TodoRoomDatabase extends RoomDatabase {

    private static TodoRoomDatabase INSTANCE;

    public static TodoRoomDatabase getDatabase(Context context) {
           if (INSTANCE == null) {
               INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                                TodoRoomDatabase.class,
                                                "todo_db").build();
           }
           return INSTANCE;
    }

    public abstract TodoDao todoModel();

}
