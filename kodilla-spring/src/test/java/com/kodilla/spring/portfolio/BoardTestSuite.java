package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd(){
        //Given

        //When
        board.getDoneList().addTask("Pranie");
        board.getDoneList().addTask("Sprzątanie");
        board.getDoneList().addTask("Mycie okien");
        board.getInProgressList().addTask("Zadania");
        board.getInProgressList().addTask("Pokój");
        board.getToDoList().addTask("Samochód");
        //Then
        Assert.assertEquals(3, board.getDoneList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
    }
}
