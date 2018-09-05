/**.
 *list abstract data types.
 *@author Viswas.
 **/
import java.util.Scanner;
/**.
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 */
public final class Fibonacci {
    /**.
     * fib is a static method takes a argument n n is the count of the fibonacci
     * numbers to be generated. The method returns a List with the n fibonacci
     * numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    /**
     * Constructs the object.
     */
    private Fibonacci() {
    }
    /**.
     * . Class for fibonacci.
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static List fib(final int n) {
        // todo - complete this method
        int sum = 0;
        int t1 = 0;
        int t2 = 1;
        List forFibonacci = new List(n);
        forFibonacci.add(t1);
        forFibonacci.add(t2);
        for (int i = 2; i < n; ++i) {
            //System.out.print(t1 + " , ");
            sum = t1 + t2;
            forFibonacci.add(sum);
            t1 = t2;
            t2 = sum;
        }
        return forFibonacci;
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
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
