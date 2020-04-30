package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    TaskListDao taskListDao;
    private static final String LISTNAME = "Pierwsza Lista";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LISTNAME, "Description");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }

}
