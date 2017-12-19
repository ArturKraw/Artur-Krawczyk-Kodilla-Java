package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {
    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;
    TaskList taskList;

    public Board (TaskList taskList) {
        this.taskList = taskList;

    }

}
