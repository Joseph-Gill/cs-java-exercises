/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RollLoadedDie {
    public static void main(String[] args) {
        double a = Math.random();
        int roll;
        if (a < 1.0 / 8.0) roll = 1;
        else if (a < 2.0 / 8.0) roll = 2;
        else if (a < 3.0 / 8.0) roll = 3;
        else if (a < 4.0 / 8.0) roll = 4;
        else if (a < 5.0 / 8.0) roll = 5;
        else roll = 6;

        System.out.println("Your roll is " + roll + '.');
    }
}
