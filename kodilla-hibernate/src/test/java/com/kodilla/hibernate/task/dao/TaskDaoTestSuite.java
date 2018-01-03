package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.task.Task;
import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;




@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    @Autowired
    private TaskDao taskDao;
    private Task task;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Before
    public void before(){
        System.out.println("Test Case: begin");
        taskDao.deleteAll();
    }

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        //When
        taskDao.save(task);
        //Then
        int id = task.getId();
        Task readTask = taskDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());
    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();
        //When
        List<Task> readTasks = taskDao.findByDuration(duration);
        //Then
        Assert.assertEquals(1, readTasks.size());
    }
}
