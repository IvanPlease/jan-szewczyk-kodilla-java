package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTest {
    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        books.add(new Book("author", "title", 1900, "signature"));
        books.add(new Book("author", "title", 2010, "signature"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int medianYear = adapter.publicationYearMedian(books);
        //Then
        System.out.println(medianYear);
        assertEquals(medianYear, 2010,0);
    }

}