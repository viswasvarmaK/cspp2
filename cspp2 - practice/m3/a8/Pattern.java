/**
 * @author   Viswas
 */
public final class Pattern {
    /**
     * Constructs the object.
     */
    private Pattern() {

   }
   /**
    *@variable FOUR variable.
    */
    private static final int FIVE = 5;
   /**
    * { function_description }.
    *
    * @param      args  The arguments
    */
   public static void main(final String[] args) {
    int i = 0;
    for (i = 1; i <= FIVE; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
   }
}
