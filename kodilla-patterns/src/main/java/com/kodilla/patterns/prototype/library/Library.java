package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nName of library = '" + name + '\'' +
                "\nBooks in the library = " + books +
                ", \nSize of the library = " + books.size() + "}";
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library) super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for (Book book : this.books) {
            Book clonedBook = new Book(book.getTitle(), book.getAuthor(), book.getPublicationDate());
            deepClonedLibrary.books.add(clonedBook);
        }
        return deepClonedLibrary;
    }
}
