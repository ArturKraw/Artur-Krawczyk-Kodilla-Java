package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test1: Learn Hibernate";
    private static final String  LISTNAME = "ListName1";

    @Test
    public void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals("ListName1", readTaskList.getListName());
        Assert.assertEquals(id, readTaskList.getId());

        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testFindByListName() {
        ///Given
        taskListDao.deleteAll();
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListDao.findByListName(listName);
        int id = readTaskList.get(0).getId();
        //Then
        Assert.assertEquals(1, readTaskList.size());

        //CleanUp
        taskListDao.deleteAll();


    }
}
