package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private int id;
    private String username;
    private char sex;
    private LocalDate birthDate;
    private int postsCount;

    public ForumUser(int id, String username, char sex, LocalDate birthDate, int postsCount) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postsCount = postsCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        LocalDate nowDate = LocalDate.now();
        Period diff = Period.between(birthDate, nowDate);
        return diff.getYears();
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate='" + birthDate + '\'' +
                ", postsCount='" + postsCount + '\'' +
                '}';
    }
}
