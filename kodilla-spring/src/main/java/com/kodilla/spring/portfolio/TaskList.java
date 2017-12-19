package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


//klasa TaskList powinna zawierać właściwość List<String> tasks.
//Jej zawartość powinna być inicjowana w konstruktorze
// przy pomocy polecenia tasks = new ArrayList<>();
public class TaskList {
    private List<Task> tasks;
    private Task task;

    public TaskList (List<Task> tasks) {
        this.tasks = new ArrayList<>();
    }

    public List<Task> addTask(Task task){
        tasks.add(task);
        return tasks;
    }

}
