/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class FivePerLine {
    public static void main(String[] args) {
        // print integers from 1000 to 2000, 5 per line
        int x = 1000;
        int y = 2000;
        int perLine = 5;
        for (int index = x; index <= y; index++) {
            System.out.print(index + " ");
            if ((index + 1) % perLine == 0) System.out.println();
        }
        System.out.println();
    }
}
