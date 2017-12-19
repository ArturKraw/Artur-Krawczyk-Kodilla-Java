package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {


    @Test
    public void testTaskAdd () {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        Task task = new Task("Task1");
        board.addToToDoList(task);
        //Then
        TaskList taskList = context.getBean("toDoList", TaskList.class);
        Assert.assertEquals(task, taskList.getTask(0));
    }
}