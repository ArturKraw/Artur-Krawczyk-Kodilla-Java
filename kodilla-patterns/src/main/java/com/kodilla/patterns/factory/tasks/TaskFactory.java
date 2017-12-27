package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class TaskFactory {

    public static final String SHOPPING = "SHOPPINGTASK";
    public static final String DRIVING = "DRIVINGTASK";
    public static final String PAINTING = "PAINTINGTASK";
    public List<DrivingTask> executedDrivingTaskList;
    public List<PaintingTask> executedPaintingTaskList;
    public List<ShoppingTask> executedShoppingTaskList;
    Task executedTask;
    public Map<String, Task> executedTaskSet = new HashMap<String,Task>();


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                executedTask = new ShoppingTask("ShoppingTask1", "bed", 1.0);

                //executedShoppingTaskList.add((ShoppingTask) executedTask);
                return executedTask;
            case DRIVING:
                executedTask = new DrivingTask("DrivingTask1", "hotel1", "car1");
                //executedDrivingTaskList.add((DrivingTask) executedTask);
                return executedTask;
            case PAINTING:
                executedTask = new PaintingTask("PaintingTask1", "blue", "room1");
                //executedPaintingTaskList.add((PaintingTask) executedTask );
                return executedTask;
            default:
                return null;
        }

    }
}
