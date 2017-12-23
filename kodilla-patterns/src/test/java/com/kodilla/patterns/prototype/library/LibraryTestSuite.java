package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.com.kodilla.patterns.prototype.TasksList;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite  {

    @Test
    public void testGetBooks() {
        //given
        //creating the TasksList for todos
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2014,12,10));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2010,9,12));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2000,7,30));
        Book book4 = new Book("Title4", "Author4", LocalDate.of(2006,5,20));
        Book book5 = new Book("Title5", "Author5", LocalDate.of(2008,3,10));
        Book book6 = new Book("Title6", "Author6", LocalDate.of(2002,8,15));

        Library library = new Library ("Library One");
            library.getBooks().add(book1);
            library.getBooks().add(book2);
            library.getBooks().add(book3);
            library.getBooks().add(book4);
            library.getBooks().add(book5);
            library.getBooks().add(book6);

        System.out.println(library);

        //When
        //Then
        Assert.assertEquals(6 , library.getBooks().size());

    }
}
