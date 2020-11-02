/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        // Stores the two names provided as arguments to the CLI
        String nameOne = args[0];
        String nameTwo = args[1];

        // Outputs Hello and Goodbye messages
        System.out.println("Hello " + nameOne + " and " + nameTwo + ".");
        System.out.println("Goodbye " + nameTwo + " and " + nameOne + ".");
    }
}
