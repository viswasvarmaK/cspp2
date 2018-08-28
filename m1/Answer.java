import java.util.Scanner;
/**.
* Class for swapping.
 * <module name="JavadocPackage"/>
*/

public final class Answer {
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
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp = a / b;
    System.out.println(temp);
  }
}
