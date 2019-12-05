package com.kodilla.testing.bookLibrary;

import java.util.List;

interface LibraryDatabase {
    List<Book> listBooksWithCondition(String titleFragment);

    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);
}