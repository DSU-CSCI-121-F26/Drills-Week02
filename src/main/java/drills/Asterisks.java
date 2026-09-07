package drills;

/**
 * Drill 1 — Asterisks.
 *
 * See README.md for the problem and the examples.
 */
public class Asterisks {

    /**
     * Builds a string of exactly n asterisks.
     *
     * @param n how many asterisks, zero or more
     * @return a string of n asterisks — {@code ""} when n is 0
     */
    public String asterisks(int n) {
        char asterisk = '*' ;
       // use string builder to slowly add the asterisks depending on n
        StringBuilder result = new StringBuilder();
        // go thru and add to the string builder
        for (int i = 0; i < n; i++) {
             result.append(asterisk);
            }
        return result.toString();
        }
    }
