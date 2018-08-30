/**Solution.java.
 * @author Viswas.
*/
/**.
 * Class for solution.
 */
import java.util.Scanner;
/**
 * Do not modify this main function.
 */
public final class Solution {
/**
 * . { function_description }
 *
 */
    private Solution() {
        //Constructor.
    }
/**.
 * Fill the main function to print the number of 7's between 1 to n.
 * @param args  The arguments.
 */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }

    /**.
     * { function_description }
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { description_of_the_return_value }
     */
    static int gcd(final int n1, final int n2) {
    int gcd = 1;
    for (int i = 1; i <= n1 && i <= n2; i++) {
            // Checks if i is factor of both integers.
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
}
