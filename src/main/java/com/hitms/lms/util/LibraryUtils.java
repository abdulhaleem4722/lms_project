package com.hitms.lms.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Reusable helper methods for the Library Management System.
 */
public final class LibraryUtils {

    /** Private constructor to prevent instantiation. */
    private LibraryUtils() {
    }

    /**
     * Returns a title in Title Case with surrounding whitespace removed.
     *
     * @param title the raw book title
     * @return the formatted title
     */
    public static String formatTitle(final String title) {
        String trimmed = title.strip().toLowerCase();
        String[] words = trimmed.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty()) {
                result.append(Character.toUpperCase(w.charAt(0)))
                      .append(w.substring(1)).append(" ");
            }
        }
        return result.toString().strip();
    }

    /**
     * Returns the number of whole days between two dates.
     *
     * @param date1 the first date
     * @param date2 the second date
     * @return the absolute number of days between the dates
     */
    public static long daysBetween(final LocalDate date1,
                                   final LocalDate date2) {
        return Math.abs(ChronoUnit.DAYS.between(date1, date2));
    }
}
