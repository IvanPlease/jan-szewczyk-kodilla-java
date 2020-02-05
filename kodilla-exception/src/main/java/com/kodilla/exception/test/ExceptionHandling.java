package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            String result = secondChallenge.probablyIWillThrowException(3, 0);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Oh no! Something went wrong! Error" + e);
        } finally {
            System.out.println("I am gonna be here always!");
        }
    }

}
