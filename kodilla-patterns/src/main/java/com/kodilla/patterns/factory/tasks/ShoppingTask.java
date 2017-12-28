package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean startedTask;
    boolean executedTask;

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
    public boolean executeTask(){
        startedTask = true;
        System.out.println("ShoppingTask: " + taskName + " has started: " + startedTask);
        return startedTask;
    }

    @Override
    public boolean isTaskExecuted(){
        executedTask=true;
        System.out.println("ShoppingTask: " + taskName + " is executed: " + executedTask);
        return executedTask;
    }

    @Override
    public String toString () {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", startedTask=" + startedTask +
                ", executedTask=" + executedTask +
                '}';
    }
}
