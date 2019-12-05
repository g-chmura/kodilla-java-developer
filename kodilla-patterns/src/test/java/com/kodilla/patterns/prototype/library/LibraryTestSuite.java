package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book number " + n, "Author" + n,
                        LocalDate.of(1995, 10, 10))));

        //shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow copy of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep copy of library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        library.getBooks().add(new Book("Test add a book", "Test",
                LocalDate.of(2019, 11, 20)));

        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
