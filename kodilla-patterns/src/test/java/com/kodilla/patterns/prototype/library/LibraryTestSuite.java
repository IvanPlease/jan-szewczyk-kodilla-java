package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Biblioteka #1");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.addBooks(new Book("Ksiazka #"+n, "Autor #"+n, LocalDate.now())));

        Library clonedBoard = null;
        try {
            clonedBoard = library.shallowCopy();
            clonedBoard.setName("Biblioteka #2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedBoard = null;
        try {
            deepClonedBoard = library.deepCopy();
            deepClonedBoard.setName("Biblioteka #3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        //Then
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedBoard.getBooks().size());
        Assert.assertEquals(10, deepClonedBoard.getBooks().size());
    }
}
