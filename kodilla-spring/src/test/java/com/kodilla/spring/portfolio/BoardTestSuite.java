package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {


    ;

    @Test
    public void testTaskAdd(){  //testSaveToDb() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.taskAdd();
        //Then
        //do nothing
    }

    @Test
    public void testRead() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When & Then
        board.read();
    }

    @Test
    public void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean task3Exists = context.containsBean("task3");
        //Then
        System.out.println("Bean task3 was found in the container: " + task3Exists);
    }
}
