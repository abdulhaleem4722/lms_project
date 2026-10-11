package com.hitms.lms;

import com.hitms.lms.model.Book;
import com.hitms.lms.service.LibraryService;
import com.hitms.lms.util.LibraryUtils;
import java.time.LocalDate;

/**
 * Driver class that uses the LMS modules.
 */
public final class Main {

    /** Private constructor to prevent instantiation. */
    private Main() {
    }

    /**
     * Program entry point.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        System.out.println(LibraryUtils.formatTitle(" the great gatsby "));
        System.out.println(LibraryUtils.daysBetween(
                LocalDate.of(2026, 1, 1), LocalDate.of(2026, 1, 15)));

        LibraryService service = new LibraryService();
        service.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        System.out.println("Books in library: " + service.getBookCount());
        System.out.println("Issue book: "
                + service.issueBook("the great gatsby"));
        System.out.println("Issue again: "
                + service.issueBook("the great gatsby"));
        System.out.println("Return book: "
                + service.returnBook("The Great Gatsby"));
    }
}
