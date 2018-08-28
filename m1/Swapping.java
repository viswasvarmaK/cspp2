import java.util.Scanner;
/**.
* Class for swapping.
*/

private class Swapping {
  /**.
  * { function_description }
  *
  * @param      args  The arguments
  */
  public static void main(String[] args) {
    /**.
     * { var_description }
     */
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int temp = 0;
    temp = a;
    a = b;
    b = temp;
    System.out.println(a);
    System.out.println(b);
  }
}
