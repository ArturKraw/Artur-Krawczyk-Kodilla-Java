package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    String executedTask;
    boolean isTaskExecuted;

    public ShoppingTask (String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String getTaskName () {
        return taskName;
    }

    public String getWhatToBuy () {
        return whatToBuy;
    }

    public double getQuantity () {
        return quantity;
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
