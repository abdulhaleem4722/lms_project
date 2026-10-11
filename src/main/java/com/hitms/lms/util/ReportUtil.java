package com.hitms.lms.util;

/**
 * Helper methods for reporting student scores.
 */
public final class ReportUtil {

    /** Sample scores used by the demo. */
    private static final int[] SAMPLE_SCORES = {78, 92, 55, 88};

    /** Private constructor to prevent instantiation. */
    private ReportUtil() {
    }

    /**
     * Returns the average of an array of numeric scores.
     *
     * @param scores the scores to average
     * @return the average score
     */
    public static double calculateAverage(final int[] scores) {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return (double) total / scores.length;
    }

    /**
     * Prints a short summary for an array of scores.
     *
     * @param scores the scores to report on
     */
    public static void printReport(final int[] scores) {
        System.out.println("Average: " + calculateAverage(scores));
    }

    /**
     * Program entry point.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        printReport(SAMPLE_SCORES);
    }
}
