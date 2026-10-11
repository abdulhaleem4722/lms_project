package com.hitms.lms.model;

/**
 * Represents a book in the library.
 */
public final class Book {

    /** The title of the book. */
    private final String title;

    /** The author of the book. */
    private final String author;

    /** True if the book is currently issued. */
    private boolean issued;

    /**
     * Creates a new book that is available for issue.
     *
     * @param title the book title
     * @param author the book author
     */
    public Book(final String title, final String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * Returns the book title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the book author.
     *
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Tells whether the book is currently issued.
     *
     * @return true if issued
     */
    public boolean isIssued() {
        return issued;
    }

    /**
     * Sets the issued status of the book.
     *
     * @param issued the new issued status
     */
    public void setIssued(final boolean issued) {
        this.issued = issued;
    }
}
