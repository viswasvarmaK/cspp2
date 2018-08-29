/**
 *@author viswas
 */
public final class ConverttoWhileLoop {
    /*
    Do not modify this main function.
    */
    /**
     * Empty Constructor.
     */
    private ConverttoWhileLoop() {

    }
    /**
    *@variable TEN variable.
    */
    private static final int TEN = 10;
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int i = 2;
        while (i <= TEN) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("GoodBye!");
    }
}
