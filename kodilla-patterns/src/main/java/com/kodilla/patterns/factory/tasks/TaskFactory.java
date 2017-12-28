package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public final class TaskFactory {

    public static final String SHOPPING = "SHOPPINGTASK";
    public static final String DRIVING = "DRIVINGTASK";
    public static final String PAINTING = "PAINTINGTASK";
    public List<DrivingTask> drivingTaskList;
    public List<PaintingTask> paintingTaskList;
    public List<ShoppingTask> shoppingTaskList;
    public Task newTask;
    public Map<String, Task> tasksMap = new HashMap<String,Task>();


    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                newTask = new ShoppingTask("ShoppingTask1", "bed", 1.0);


                return newTask;
            case DRIVING:
                newTask = new DrivingTask("DrivingTask1", "hotel1", "car1");

                return newTask;
            case PAINTING:
                newTask = new PaintingTask("PaintingTask1", "blue", "room1");
                //executedPaintingTaskList.add((PaintingTask) executedTask );
                return newTask;
            default:
                return null;
        }

    }
}
