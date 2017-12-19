package com.kodilla.spring.portfolio;


import com.kodilla.spring.reader.IfDayIsOddCondition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier(value = "list1")
    private TaskList taskList, toDoList, inProgressList, doneList;

    @Bean
    public Board getBoard(){
        return new Board(taskList);
    }

    @Bean(name = "list1")
    @Scope("prototype")
    public Board getToDoList() {
        return new Board(toDoList);
    }

    @Bean(name = "list2")
    @Scope("prototype")
    public Board getInProgressList() {
        return new Board(inProgressList);
    }
    @Bean(name = "list3")
    @Scope("prototype")
    public Board getDoneList() {
        return new Board(doneList);
    }

    @Bean(name = "taks3")
    @Scope("prototype")
    @Conditional(IfDayIsOddCondition.class)
    public TaskList getTaskList() {
        return new TaskList(list1);
    }
}

