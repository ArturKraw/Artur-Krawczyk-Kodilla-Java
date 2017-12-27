package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    String executedTask;
    boolean isTaskExecuted;

    public PaintingTask (String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName () {
        return taskName;
    }

    public String getColor () {
        return color;
    }

    public String getWhatToPaint () {
        return whatToPaint;
    }

    @Override
    public String executeTask(){
        executedTask = "DrivingTask: " + taskName + " has started";
        return executedTask;
    }

    @Override
    public boolean isTaskExecuted(){
        if (executedTask!=null){
            isTaskExecuted=true;
        } else {
            isTaskExecuted = false;
        }
        return isTaskExecuted;
    }
}
