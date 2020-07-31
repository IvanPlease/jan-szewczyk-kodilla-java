package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Excobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaToolsForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaToolsForum.addPost("Hi everyone! Could you help me with for loop?");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}