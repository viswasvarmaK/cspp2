import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Viswas
 */
class Set {
    /**
     * size method.
     *
     * @param      items  says the size of set.
     *
     * @return     int.
     */
    public int size(final int items) {
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s[i] != null) {
                size = size + 1;
            }
        return size;
        }
    }
    /**.
     * contains method
     *
     * @param      items  says the item is not in the set or not.
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int items) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (s[i] == item) {
                count = count + 1;
            }
        }
        if (count > 0) {
            return true;
        }
        return false;
    }
    /**.
     * to string method
     *
     * @return     String representation of the object
     */
    public String toString() {
         if (size == 0) {
            return "";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size - 1; i++) {
            str = str + list[i] + ",";
        }
        str = str + list[i] + "}";
        return str;
    }
    /**.
     * void add method
     *
     * @param      item of.
     */
    public static void add(final int item) {
        for (int i = 0; i < s.length(); i++) {
            if (size == s.length()) {
                int size = size * 2;
            }
            if (s[i] != item) {
                s[i] = item;
                size++;
            }
        }
        return s;
    }
    /**
     * add method.
     *
     * @param      array  The array.
     */
    public void add(final int[]array) {
        Set init = new Set();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i.size; j++) {
                set[i] = item;
            System.out.println(init);
            }
        }
    }
    // public Set interaction(final int Set) {
    //  Set a[] = new Set(a[100]);
    //  Set init = new Set();
    //  for (int i = 0; i<=s.length(); i++) {
    //      if (init == s[i])
    //          a[i].add(init);
    //          i++;
    //  }
    //  return a[];
    // }
    // public static Set retainAll(final int[]) {
    //  Set a[] = new Set(a[100]);
    //  Set init = new Set();
    //  for (int i = 0; i<=s.length(); i++) {
    //      if (init == s[i])
    //          a[i].add(init);
    //  }
    //  return a[];
    // }
    // public static int[][] cartesianProduct(Set){
    //  return null;
    // }
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
