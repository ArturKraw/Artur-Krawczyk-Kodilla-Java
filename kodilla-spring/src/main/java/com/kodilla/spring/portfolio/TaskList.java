package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


//klasa TaskList powinna zawierać właściwość List<String> tasks.
//Jej zawartość powinna być inicjowana w konstruktorze
// przy pomocy polecenia tasks = new ArrayList<>();
public class TaskList {
    private List<Task> tasks;
    private Task task;

    public TaskList () {
        this.tasks = new ArrayList<>();
    }

    public List<Task> addTask(Task task){
        tasks.add(task);
        return tasks;
    }
    public Task getTask (int index) {
        return tasks.get(index);
    }


    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (!(o instanceof TaskList)) return false;

        TaskList taskList = (TaskList) o;

        if (tasks != null ? !tasks.equals(taskList.tasks) : taskList.tasks != null) return false;
        return task != null ? task.equals(taskList.task) : taskList.task == null;
    }

    @Override
    public int hashCode () {
        int result = tasks != null ? tasks.hashCode() : 0;
        result = 31 * result + (task != null ? task.hashCode() : 0);
        return result;
    }
}
