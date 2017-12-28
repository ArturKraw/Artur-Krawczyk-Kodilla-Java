package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean startedTask;
    boolean executedTask;

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
    public boolean executeTask(){
        startedTask = true;
        System.out.println("PaintingTask: " + taskName + " has started: " + startedTask);
        return startedTask;
    }

    @Override
    public boolean isTaskExecuted(){
        executedTask=true;
        System.out.println("PaintingTask: " + taskName + " is executed: " + executedTask);
        return executedTask;
    }
}
