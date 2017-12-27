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
        //Assert.assertEquals(true, drivingTask.isTaskExecuted());
        Assert.assertEquals("DrivingTask1", drivingTask.getTaskName());
    }


    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        //Then
        //Assert.assertEquals(true, paintingTask.isTaskExecuted());
        Assert.assertEquals("PaintingTask1", paintingTask.getTaskName());
        //Assert.assertEquals("blue", paintingTask.getColor());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        //Then
        //Assert.assertEquals(true, shoppingTask.isTaskExecuted());
        Assert.assertEquals("ShoppingTask1", shoppingTask.getTaskName());
    }
}
