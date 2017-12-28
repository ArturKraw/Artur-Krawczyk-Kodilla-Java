package com.kodilla.patterns.factory.tasks;

import java.util.List;

public class TaskList {
    String taskName;
    boolean taskStarted;
    boolean taskExecuted;

    public TaskList (String taskName, boolean taskStarted, boolean taskExecuted) {
        this.taskName = taskName;
        this.taskStarted = taskStarted;
        this.taskExecuted = taskExecuted;
    }

    public String getTaskName () {
        return taskName;
    }

    public boolean isTaskStarted () {
        return taskStarted;
    }

    public boolean isTaskExecuted () {
        return taskExecuted;
    }

    public void setTaskName (String taskName) {
        this.taskName = taskName;
    }

    public void setTaskStarted (boolean taskStarted) {
        this.taskStarted = taskStarted;
    }

    public void setTaskExecuted (boolean taskExecuted) {
        this.taskExecuted = taskExecuted;
    }

    @Override
    public String toString () {
        return "TaskList{" +
                "taskName='" + taskName + '\'' +
                ", taskStarted=" + taskStarted +
                ", taskExecuted=" + taskExecuted +
                '}';
    }
}
