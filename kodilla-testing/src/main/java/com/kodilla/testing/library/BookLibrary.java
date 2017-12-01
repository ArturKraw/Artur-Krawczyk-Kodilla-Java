package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;
    public BookLibrary (LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }


    public List <Book> listBooksWithCondition (String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    //List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    public List <Book> listBooksInHandsOf (LibraryUser libraryUser) {

       List<Book> resultList2 = new ArrayList<Book>();

        resultList2 = libraryDatabase.listBooksInHandsOf(libraryUser);
        System.out.println("\n" + "LibrayUser: " + libraryUser);
        System.out.println("ResultList2: " + resultList2);

    return resultList2;
    }
}
