/**
 * Author : Viswas.
 * Date : 28-08-2018.
 */
import java.util.Scanner;
/**.
* Class for swapping.
 * <module name="JavadocPackage"/>
*/

public final class Solution {
    /**
     * Constructor.
     */
    private Solution() {
        //Zero parameter constructor.
    }

    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static  void main(final String[] args) {
    /**.
     * { var_description }
     */
    Scanner sc = new Scanner(System.in);
    System.out.println("temperature in degrees");
    double degree = sc.nextInt();
    System.out.println("temperature in fahrenheit");
    final float a = 9;
    final float b = 5;
    final float add = 32;
    double temperature = (a / b) * degree + add;
    System.out.println(temperature);
  }
}
