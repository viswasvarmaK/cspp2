/**
 * Author : Viswas.
 * Date : 28-08-2018.
 */
import java.util.Scanner;

/**.
 * Class for formule.
 */
public final class Solution {
    /**
     * Constructor.
     */
    private Solution() {
        // Zero parameter constructor
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner ip = new Scanner(System.in);
        int base = ip.nextInt();
        int height = ip.nextInt();
        float formulee = areaoftriangle(base, height);
        System.out.println(formulee);
    }
    /**
     * Function for area of triangle.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static float areaoftriangle(final int a, final int b) {
        /**.
         * { item_description }
         */
        final float c = 0.5;
        area =  c * a * b;
        return area;
    }
}

