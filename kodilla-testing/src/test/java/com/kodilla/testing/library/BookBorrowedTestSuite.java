package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookBorrowedTestSuite {
    LibraryUser libraryUser;

    private List<Book> generateListOfNBooks (int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
                Book theBook = new Book("Title" + n, "Author" + n, 1990 + n);
                resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testlistBooksInHandsOfLibraryUserZeroBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser1 = new LibraryUser("Jan", "Kowalski", "990909");
        libraryUser = libraryUser1;
        List<Book> resultListOf0Books = generateListOfNBooks(0);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf0Books);

        // When
        List<Book> theListOfBooksUser1 = bookLibrary.listBooksInHandsOf(libraryUser1);

        // Then
        assertEquals(0, theListOfBooksUser1.size());
        System.out.println("Quantity of borrowed books: expected: 0; actual:  " + theListOfBooksUser1.size());
    }

    @Test
    public void testlistBooksInHandsOfLibraryUseOneBook() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser2 = new LibraryUser("Anna", "Nowak", "980808");
        libraryUser = libraryUser2;
        List<Book> resultListOf1Books = generateListOfNBooks(1);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf1Books);

        // When
        List<Book> theListOfBooksUser2 = bookLibrary.listBooksInHandsOf(libraryUser2);

        // Then
        assertEquals(1, theListOfBooksUser2.size());
        System.out.println("Quantity of borrowed books: expected: 1; actual:  " + theListOfBooksUser2.size());
    }

    @Test
    public void testlistBooksInHandsOfLibraryUserFiveBooks() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser3 = new LibraryUser("Adam", "Potocki", "970707");
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(resultListOf5Books);

        // When
        List<Book> theListOfBooksUser3 = bookLibrary.listBooksInHandsOf(libraryUser3);

        // Then
        assertEquals(5, theListOfBooksUser3.size());
        System.out.println("Quantity of borrowed books: expected: 5; actual:  " + theListOfBooksUser3.size());
    }
}

