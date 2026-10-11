package com.hitms.lms.service;

import com.hitms.lms.model.Book;
import com.hitms.lms.util.LibraryUtils;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles add, issue and return operations for the library.
 */
public class LibraryService {

    /** All books known to the library. */
    private final List<Book> books = new ArrayList<>();

    /**
     * Adds a book to the library.
     *
     * @param book the book to add
     */
    public void addBook(final Book book) {
        books.add(book);
    }

    /**
     * Issues a book if it exists and is available.
     *
     * @param title the title to issue
     * @return true if the book was issued
     */
    public boolean issueBook(final String title) {
        Book book = findByTitle(title);
        if (book == null || book.isIssued()) {
            return false;
        }
        book.setIssued(true);
        return true;
    }

    /**
     * Returns a book that is currently issued.
     *
     * @param title the title to return
     * @return true if the book was returned
     */
    public boolean returnBook(final String title) {
        Book book = findByTitle(title);
        if (book == null || !book.isIssued()) {
            return false;
        }
        book.setIssued(false);
        return true;
    }

    /**
     * Returns the number of books in the library.
     *
     * @return the book count
     */
    public int getBookCount() {
        return books.size();
    }

    /**
     * Finds a book by title, ignoring case and extra spaces.
     *
     * @param title the title to look for
     * @return the matching book, or null if none is found
     */
    private Book findByTitle(final String title) {
        String wanted = LibraryUtils.formatTitle(title);
        for (Book book : books) {
            if (LibraryUtils.formatTitle(book.getTitle()).equals(wanted)) {
                return book;
            }
        }
        return null;
    }
}
