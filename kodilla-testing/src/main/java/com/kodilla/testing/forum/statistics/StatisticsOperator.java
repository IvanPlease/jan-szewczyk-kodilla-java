package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;

import java.util.List;

public class StatisticsOperator {

    private int postsCount;
    private int commentsCount;
    private double avgPostUser;
    private double avgComUser;
    private double avgComPost;

    public double getAvgPostUser() {
        return avgPostUser;
    }

    public double getAvgComUser() {
        return avgComUser;
    }

    public double getAvgComPost() {
        return avgComPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(postsCount != 0 && statistics.usersNames().size() != 0){
            avgPostUser = postsCount / (double) statistics.usersNames().size();
        }
        if(commentsCount != 0 && postsCount != 0){
            avgComPost = commentsCount / (double) postsCount;
        }
        if(commentsCount != 0 && statistics.usersNames().size() != 0){
            avgComUser = commentsCount / (double) statistics.usersNames().size();
        }
    }

    public void showStatistics(){
        System.out.println("Liczba postow" + postsCount);
        System.out.println("Liczba komentarzy" + commentsCount);
    }

}
