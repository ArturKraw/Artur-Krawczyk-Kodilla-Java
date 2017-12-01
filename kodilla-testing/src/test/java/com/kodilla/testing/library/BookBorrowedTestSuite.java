package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
/*
Zaimplementuj kolejną metodę klasy BookLibrary - listBooksInHandsOf(LibraryUser libraryUser). Przetestuj tę metodę w różnych scenariuszach:
gdy użytkownik nie ma wypożyczonych żadnych książek,
gdy ma wypożyczoną jedną książkę,
gdy ma wypożyczone 5 książek.
*/
public class BookBorrowedTestSuite {

    private List<Book> generateListOfNBooks (int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
/*
public List <Book> listBooksInHandsOf (LibraryUser libraryUser) {
        List<Book> bookListBorrowed = new ArrayList<Book>();
        Book book = new Book("The book1 title", "The book1 author", 2001);
        bookListBorrowed.add(book);

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<Book>();
*/
    @Test
        public void testListBorrowedBooksWithConditionsZeroBB() {
        // Given

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser = new LibraryUser(libraryDatabaseMock);

        //LibraryUser libraryUser1 = new LibraryUser("John", "Shmidt", "991021");
        List<Book> listBooksThisUser = new ArrayList<Book>();

        //HashMap<LibraryUser libraryUser, ArrayList<Book> listBooksThisUser) usersBorrowedBooks = new HashMap<>();

        List<Book> ListBoocksThisUser = new ArrayList<Book>();
        Book book1 = new Book("Title1", "John RobertsonSmith", 2008);
        Book book2 = new Book("Title2", "Dilbert Michigan", 2010);
        Book book3 = new Book("Title3", "Steve Wozinak", 2016);
        Book book4 = new Book("Title4", "Ian Tenewitch", 2010);
        Book book5 = new Book("Title5", "Steve Wozinak", 204);
        Book book6 = new Book("Title6", "Ian Tenewitch", 206);


        ListBoocksThisUser.add(book1); /;resultbook
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        lis]
        assertEquals(0, theListOfBooks.size());
    }



    @Test
    public void testListBorrowedBooksWithConditionsOneBB() {
        assertTrue(false);
    }

    @Test
    public void testListBorrowedBooksWithConditions5BB() {
        assertTrue(false);
    }
}

}
