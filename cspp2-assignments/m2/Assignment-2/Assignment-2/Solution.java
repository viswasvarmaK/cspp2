import java.util.Scanner;
/**Solution.java.
 *do not modify this main function.
 * @author Viswas.
 */
public final class Solution {
    /**
     *to declare a magic number.
     */
    private static final int FOUR = 4;
    /**
     *private constructor.
     */
    private Solution() {
        // we are not using this constructor.
    }
    /**
     *@param args variable
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
     *Need to write the rootsOfQuadraticEquation func and prints output.
     *@param a variable a
     *@param b variable b
     *@param c variable c
     */
    static void rootsOfQuadraticEquation(final double a,
                                         final double b,
                                         final double c) {
        double determinant  = (b * b) - (FOUR * a * c);
        double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
