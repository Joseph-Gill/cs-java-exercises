/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        // Stores 3 arguments from the CLI as integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Output the boolean value of:
        // 1) All integers are positive
        // 2) a^2 + b^2 = c^2
        System.out.println(
                a > 0 && b > 0 && c > 0
                        && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)
                        || Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)
                        || Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2))
        );
    }
}
