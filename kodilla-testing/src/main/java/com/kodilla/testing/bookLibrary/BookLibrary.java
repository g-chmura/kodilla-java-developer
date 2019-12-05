package com.kodilla.testing.bookLibrary;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<com.kodilla.testing.bookLibrary.Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3){
            return bookList;
        }

        List<com.kodilla.testing.bookLibrary.Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            return bookList;
        }
        bookList = resultList;
        return bookList;
    }

    public List<com.kodilla.testing.bookLibrary.Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<com.kodilla.testing.bookLibrary.Book> bookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return bookList;
    }
}
