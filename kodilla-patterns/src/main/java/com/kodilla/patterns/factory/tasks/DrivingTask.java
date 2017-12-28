package com.kodilla.patterns.factory.tasks;

import java.util.List;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;
    boolean startedTask;
    boolean executedTask;

    public DrivingTask (String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }
    @Override
    public String getTaskName () {
        return taskName;
    }

    public String getWhere () {
        return where;
    }

    public String getUsing () {
        return using;
    }

    @Override
    public boolean executeTask(){
        startedTask = true;
        System.out.println("DrivingTask: " + taskName + " has started: " + startedTask);
        return startedTask;
    }

    @Override
    public boolean isTaskExecuted(){
        executedTask=true;
        System.out.println("DrivingTask: " + taskName + " is executed: " + executedTask);
        return executedTask;
    }

    @Override
    public String toString () {
        return "DrivingTask{" +
                "taskName='" + taskName + '\'' +
                ", where='" + where + '\'' +
                ", using='" + using + '\'' +
                ", startedTask=" + startedTask +
                ", executedTask=" + executedTask +
                '}';
    }
}
