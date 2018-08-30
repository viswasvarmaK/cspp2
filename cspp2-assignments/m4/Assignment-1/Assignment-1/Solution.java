/**Solution.java.
 * @author Viswas.
 */
/**.
 * Class for this solution.
 */
import java.util.Scanner;
/**.
 * { item_description }
 */
public final class Solution {
/**.
 *Fill this main function to print maximum of given array.
 */
    private Solution() {
        //Empty Constructor.
    }
    /**.
     *@param      args  The arguments.
     */
    public static void main(final String[] args) {
    /**.
     * { item_description }
     */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            a[i] = sc.nextInt();
        }
        // for (int i=0; i< n-1; i++) {
        //     System.out.println(a[i]+ ", ");
        // }
        // System.out.println(a[n-1]);

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            /**.
             * { item_description }
             */
            if (a[i] > max) {
                max = a[i];
            }
        }
    System.out.println(max);

    }
}
