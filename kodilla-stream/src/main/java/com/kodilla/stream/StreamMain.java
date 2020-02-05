package com.kodilla.stream;

import com.kodilla.stream.beautifier.BeautifierFunctions;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.book.BookDirectory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Text Beautifier");
        poemBeautifier.beautifier("tekscik", (tekst)->tekst+"ABC");
        poemBeautifier.beautifier("tekscik", String::toUpperCase);
        poemBeautifier.beautifier("TekScIk", String::toLowerCase);
        poemBeautifier.beautifier("TekScIk", BeautifierFunctions::generateNew);
        poemBeautifier.beautifier("TekScIk", BeautifierFunctions::generateNewReverse);

        System.out.println();

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        System.out.println();

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println();

        BookDirectory bookDirectory = new BookDirectory();

        bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println();

        List<Book> theResultListOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println();

        Map<String, Book> theResultMapOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

        String theResultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println();

        Forum forum = new Forum();

        forum.getUserList().stream()
                .filter(u -> u.getSex() == 'M')
                .map(ForumUser::toString)
                .forEach(System.out::println);

        forum.getUserList().stream()
                .filter(u -> u.getAge() > 20)
                .forEach(System.out::println);

        forum.getUserList().stream()
                .filter(u -> u.getPostsCount() > 1)
                .forEach(System.out::println);

        Map<Integer, ForumUser> par = forum.getUserList().stream()
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + par.size());
        par.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();

    }
}