package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Book;
import com.kodilla.spring.reader.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class BoardConfig {
    @Autowired
    @Qualifier("book1")
    Book book;

    @Bean
    public Reader getReader() {
        return new Reader(book);
    }

    @Bean(name = "taskToDo")
    @Scope("prototype")
    public Book getToDoTask() {
        return new Book("The book number one");
    }

    @Bean(name = "taskInProgress")
    @Scope("prototype")
    public Book getTasksInProgress() {
        return new Book("The book number two");
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public Book getDoneList() {
        return new Book("The book number three");
    }
}