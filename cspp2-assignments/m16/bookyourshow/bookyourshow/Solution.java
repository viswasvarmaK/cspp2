/**
 * @author : Viswas.
 */
import java.util.Scanner;
/**
 * importing to use scanner.
 */
import java.util.ArrayList;
/**
 * to use array lists.
 */
import java.util.Arrays;
/**
 * to use array function.
 */

public final class Solution {

    /**
     * used to create constructor.
     */
    private Solution() {
        /**
         * Solution constructor.
         */
    }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * main function.
         */
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}
/**
 * Class for show.
 */
class Show {

    /**
     * creating variables to get desired output.
     */
    private String movie;
    /**.
     * string movie name
     */
    private String showTime;
    /**.
     * string showtime details
     */
    private String[] seats;
    /**
     * string array seat
     */

    /**
     * Constructs the object.
     *
     * @param      moviea     The moviea
     * @param      showTimea  The show timea
     * @param      seat       The seat
     */
    Show(final String moviea, final String showTimea, final String[] seat) {
        /**
         * using parameters movi, showTim, seat
         */
        this.movie = moviea;
        this.showTime = showTimea;
        this.seats = seat;
    }
    /**
     * Gets the movie.
     *
     * @return     The movie.
     */
    String getMovie() {
        return movie;
    }
    /**
     * Gets the show time.
     *
     * @return     The show time.
     */
    String getShowTime() {
        return showTime;
    }
    /**
     * Gets the seats.
     *
     * @return     The seats.
     */
    String[] getSeats() {
        return seats;
    }
    /**
     * Sets the seat na.
     *
     * @param      index  The index
     */
    void setSeatNA(final int index) {
        seats[index] = "N/A";
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        /**
         * to string method.
         */
        return movie + "," + showTime;
    }
}
/**
 * . Class for patron .
 */
class Patron {
    /**
     * this is a class called patron.
     */
    private String name;
    /**.
     * String name
     */
    private String mobile;
    /**
     * string mobile number
     */
    /**
     * Constructs the object.
     *
     * @param      name1     The name 1
     * @param      mobilnum  The mobilnum
     */
    Patron(final String name1, final String mobilnum) {
        /**
         * here we use parameters name1 and mobilnum.
         */
        this.name = name1;
        this.mobile = mobilnum;
    }
    /**.
     * Gets the name of movie.
     *
     * @return     The name.
     */
    String getName() {
        /**.
         * to get movie name.
         */
        return name;
    }
    /**.
     * Gets the mobile number.
     *
     * @return     The mobile.
     */
    String getMobile() {
        /**.
         * used to get mobile number.
         */
        return mobile;
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        /**.
         * to string function.
         */
        return name + " " + mobile;
    }
}
/**
 * . Class for book your show which helps in booking.
 */
class BookYourShow {
    /**.
     * used to book a show.
     */

    /**
     * Class bookyourshow.
     */
    private ArrayList<Show> showList;
    /**
     * show generic.
     */
    private ArrayList<String> ticketList;
    /**
     * ticketlist generic.
     */
    BookYourShow() {
        showList = new ArrayList<>();
        ticketList = new ArrayList<>();
    }
    /**.
     * Adds a show function used to add.
     *
     * @param      show  The show
     */
    void addAShow(final Show show) {
        /**.
         * used to add show.
         */
        showList.add(show);
    }
    /**.
     * Gets a show used to get data.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     *
     * @return     A show.
     */
    Show getAShow(final String movie, final String showTime) {
        /**.
         *  Gets a show used to get data.
         */
        for (Show show: showList) {
            if (show.getMovie().equals(movie)
            && show.getShowTime().equals(showTime)) {
                return show;
            }
        }
        return null;
    }
    /**.
     * used in creating a show using parameters
     * such as movie name, showtime, etc.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     * @param      patron    The patron
     * @param      seats     The seats
     */
    void bookAShow(final String movie, final String showTime,
        /**.
         * using parameters such as movie name, showtime.
         */
    final Patron patron, final String[] seats) {
        Show show = getAShow(movie, showTime);
        if (show == null) {
            System.out.println("No show");
            return;
        }
        boolean flag = false;
        String[] sseats = show.getSeats();
        for (String seat: seats) {
            for (int i = 0; i < sseats.length; i++) {
                if (seat.equals(sseats[i])) {
                show.setSeatNA(i);
                flag = true;
                }
            }
        }
        if (flag) {
            ticketList.add(patron.getMobile()
                + " " + movie + " " + showTime);
        }
    }
    /**.
     * Used to print tickets.
     *
     * @param      movie     The movie
     * @param      showTime  The show time
     * @param      mobile    The mobile
     */
    void printTicket(final String movie, final String showTime,
        /**.
         * Function used to print tickets.
         */
    final String mobile) {
        String t = mobile + " " + movie + " " + showTime;
        if (ticketList.contains(t)) {
            System.out.println(t);
        } else {
            System.out.println("Invalid");
        }
    }
    /**.
     * Shows all is a method, used to show details of movies.
     */
    void showAll() {
        /**.
         * Function used to show details of movies.
         */
        for (Show show: showList) {
            System.out.println(show.toString() + ","
            + Arrays.toString(show.getSeats()).replace(" ", ""));
        }
    }
}
