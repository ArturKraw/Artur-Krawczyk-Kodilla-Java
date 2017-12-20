package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board (TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList () {
        return toDoList;
    }
    public void add2toDoList (Task task) {toDoList.addTask(task); }

    public TaskList getInProgressList () {
        return inProgressList;
    }
    public void add2inProgressList (Task task) {inProgressList.addTask(task); }

    public TaskList getDoneList () {
        return doneList;
    }
    public void add2doneList (Task task) {doneList.addTask(task); }


    @Override
    public String toString () {
        return "Board{" +
                "toDoList=" + toDoList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
