package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(1, "IvanPlease", 'M', LocalDate.of(2005, 1, 16), 0));
        forumUsers.add(new ForumUser(2, "IvanPlease", 'M', LocalDate.of(1999, 11, 16), 1));
        forumUsers.add(new ForumUser(3, "IvanPlease", 'M', LocalDate.of(2003, 11, 16), 100));
        forumUsers.add(new ForumUser(4, "IvanPlease", 'M', LocalDate.of(1999, 11, 16), 5));
        forumUsers.add(new ForumUser(5, "IvanPlease", 'M', LocalDate.of(2010, 11, 16), 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }

}
