package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    int index;

    @Test
    public void testTaskAdd2toDoList () {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        Task task = new Task("Task1");
        String taskListChecqued = "toDoList";
        board.add2toDoList(task);
        //Then
        TaskList taskList = context.getBean(taskListChecqued, TaskList.class);
        boolean taskAddVerif = taskList.checkTask(task);
        if (taskAddVerif){ index = taskList.indexOfTask(task);}
        System.out.println("Task: " + task +  " added to TaskList: toDoList");
        Assert.assertEquals(true, taskAddVerif);
        System.out.println("List <toDoList> contains this task : " + taskAddVerif);
        Assert.assertEquals(task, taskList.getTask(index));
        System.out.println("Task: " + task + " found in TaskList <toDoList> (at index: " + index + ") ");
    }

    @Test
    public void testTaskAdd2inProgressList () {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        Task task = new Task("Task2");
        String taskListChecqued = "inProgressList";
        board. add2inProgressList(task);
        //Then
        TaskList taskList = context.getBean(taskListChecqued, TaskList.class);
        boolean taskAddVerif = taskList.checkTask(task);
        if (taskAddVerif){ index = taskList.indexOfTask(task);}
        System.out.println("Task: " + task +  " added to TaskList: inProgressList");
        Assert.assertEquals(true, taskAddVerif);
        System.out.println("List <inProgressList> contains this task : " + taskAddVerif);
        Assert.assertEquals(task, taskList.getTask(index));
        System.out.println("Task: " + task + " found in TaskList <inProgressList> (at index: " + index + ") ");
    }

    @Test
    public void testTaskAdd2doneList() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        Task task = new Task("Task3");
        String taskListChecqued = "doneList";
        board. add2doneList(task);
        //Then
        TaskList taskList = context.getBean(taskListChecqued, TaskList.class);
        boolean taskAddVerif = taskList.checkTask(task);
        if (taskAddVerif){ index = taskList.indexOfTask(task);}
        System.out.println("Task: " + task +  " added to TaskList: doneList");
        Assert.assertEquals(true, taskAddVerif);
        System.out.println("List <doneList> contains this task : " + taskAddVerif);
        Assert.assertEquals(task, taskList.getTask(index));
        System.out.println("Task: " + task + " found in TaskList <doneList> (at index: " + index + ") ");
    }
}


                                                                                          