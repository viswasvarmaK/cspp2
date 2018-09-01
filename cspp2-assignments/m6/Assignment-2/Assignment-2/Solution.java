import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :Viswas
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest 100.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, final int rows,
     final int columns) {
        int p = 550;
        int q = 500;
        int r = 450;
        int s = 400;
        int t = 350;
        int u = 300;
        int v = 250;
        int w = 200;
        int x = 150;
        int y = 100;
        int z = 50;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] > r*1 && a[i][j] < p*1) {
                    a[i][j] = q;
                }
                if (a[i][j] <= r*1 && a[i][j] >= t*1) {
                    a[i][j] = s;
                }
                if (a[i][j] <= t*1 && a[i][j] >= v*1) {
                    a[i][j] = u;
                }
                if (a[i][j] <= v*1 && a[i][j] >= x*1) {
                    a[i][j] = w;
                }
                if (a[i][j] <= x*1 && a[i][j] >= z*1) {
                    a[i][j] = y;
                }
                if (a[i][j] < z*1) {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
