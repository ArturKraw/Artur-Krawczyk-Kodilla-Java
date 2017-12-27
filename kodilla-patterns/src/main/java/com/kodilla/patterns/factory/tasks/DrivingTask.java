package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    final String taskName;
    final String where;
    final String using;
    String executedTask;
    boolean isTaskExecuted;

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
    public String executeTask(){

        executedTask = "DrivingTask: " + taskName + " has started";
        return executedTask;
    }

    @Override
    public boolean isTaskExecuted(){
        if (getWhere{
            isTaskExecuted=true;
        } else {
            isTaskExecuted = false;
        }
        return isTaskExecuted;
    }

}
