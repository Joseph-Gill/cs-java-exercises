/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ThreeSort {
    public static void main(String[] args) {
        // Takes 3 inputs from the cli and converts them to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Compute the smallest and largest int
        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        // Compute the middle value
        int total = a + b + c;
        int middleValue = total - largest - smallest;

        // Output the int in ascending order
        System.out.println(smallest + ", " + middleValue + ", " + largest);
    }
}
