import java.util.Scanner;
/**.
* Class for swapping.
 * <module name="JavadocPackage"/>
*/

public final class Degree {
  /**.
  * constructor
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
    double temperature = (9/5) * degree + 32;
    System.out.println(temperature);
  }
}
