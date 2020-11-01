/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class UniformRandomNumbers {
    public static void main(String[] args) {
        // Generate 5 random numbers between 0 and 1, not included
        double random1 = Math.random();
        double random2 = Math.random();
        double random3 = Math.random();
        double random4 = Math.random();
        double random5 = Math.random();

        // Output the 5 random numbers to the console
        System.out.println("Random Number 1: " + random1);
        System.out.println("Random Number 2: " + random2);
        System.out.println("Random Number 3: " + random3);
        System.out.println("Random Number 4: " + random4);
        System.out.println("Random Number 5: " + random5);

        // Computes the average value of the 5 random numbers
        double average = (random1 + random2 + random3 + random4 + random5) / 2;

        // Output the average value to the console
        System.out.println("Average value of Random numbers: " + average);

        // Computes the minimum and maximum value of the 5 random numbers
        double minimum = Math
                .min(random1, Math.min(random2, Math.min(random3, Math.min(random4, random5))));
        double maximum = Math
                .max(random1, Math.max(random2, Math.max(random3, Math.max(random4, random5))));

        // Output the minimum and maximum random values
        System.out.println("Minimum Random Number: " + minimum);
        System.out.println("Maximum Random Number: " + maximum);
    }
}
