package com.kodilla.patterns.factory.tasks;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {


    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("DrivingTask1", drivingTask.getTaskName());
    }

    @Test
    public void testFactoryDrivingTask2() {
        //Given
        TaskFactory factory = new TaskFactory();
        TaskList taskList;
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        System.out.println("New drivingTask: " + drivingTask);
        taskList = new TaskList(drivingTask.getTaskName(), false, false);
        System.out.println("TaskList-1: " + taskList);
        boolean startedTask = drivingTask.executeTask();
        taskList.setTaskStarted(startedTask);
        System.out.println("TaskList-2: " + taskList);
        boolean executedTask = drivingTask.isTaskExecuted();
        taskList.setTaskExecuted(executedTask);
        System.out.println("TaskList-3: " + taskList);

        //Then
        Assert.assertEquals("DrivingTask1", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("PaintingTask1", paintingTask.getTaskName());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("ShoppingTask1", shoppingTask.getTaskName());
    }
}
