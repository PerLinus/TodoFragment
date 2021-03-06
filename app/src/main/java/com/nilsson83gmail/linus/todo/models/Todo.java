package com.nilsson83gmail.linus.todo.models;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


/**
 * Created by s060qm on 3/7/2018.
 */
@Entity
public class Todo {

    @PrimaryKey(autoGenerate = true)
    public int id;
    private String name;
    private String todos;

    public Todo(String name, String todos) {
        this.name = name;
        this.todos = todos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTodos() {
        return todos;
    }

    public void setTodos(String todos) {
        this.todos = todos;
    }

}

