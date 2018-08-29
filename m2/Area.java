/**.
 * { item_description }
 */
import java.util.Scanner;
/**.
* Class for swapping.
 * <module name="JavadocPackage"/>
*/

public final class Area {
  /**.
  * constructor
  *
  * @param      args  The arguments
  */
    public static  void main(final String[] args) {
    /**.
     * { var_description }
     */
    // Scanner sc = new Scanner(System.in);
    // float r = sc.nextFloat();
    System.out.println(AreaOf());
    }
    public static double AreaOf() {
    	/**.
    	 * { var_description }
    	 */
    	Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
    	double i = 3.14;
    	double area = i * r * r;
        return area;

    }

}
