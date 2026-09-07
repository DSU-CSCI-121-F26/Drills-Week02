package drills;

/**
 * Drill 2 — Show me the Numbers.
 *
 * See README.md for the problem and the examples.
 */
public class ShowMeTheNumbers {

    /**
     * Builds the numbers 1 through n, each followed by a newline.
     *
     * Use "\n" for the newline, not System.lineSeparator() — the tests compare
     * against "\n" exactly, on every operating system.
     *
     * @param n the last number to include, zero or more
     * @return the numbers 1..n, each followed by "\n" — {@code ""} when n is 0
     */
    public String count(int n) {
        String slash = "\n" ;
        // start with what needs to be added
        StringBuilder result = new StringBuilder();
        // string builder stores the result of the numbers going up to n with the "\n"
        for (int i = 1; i <= n; i++) {
            result.append(i).append(slash);
        }
        return result.toString();

    }
}
