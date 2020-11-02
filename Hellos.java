/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Hellos {
    public static void main(String[] args) {
        int timesHello = Integer.parseInt(args[0]);
        int index = 1;

        while (index <= timesHello) {
            if (index % 100 >= 11 && index % 100 <= 13) {
                System.out.println(index + "th Hello");
                index++;
            }
            else if (index == 1 || (index - 1) % 10 == 0) {
                System.out.println(index + "st Hello");
                index++;
            }
            else if (index == 2 || (index - 2) % 10 == 0) {
                System.out.println(index + "nd Hello");
                index++;
            }
            else if (index == 3 || (index - 3) % 10 == 0) {
                System.out.println(index + "rd Hello");
                index++;
            }
            else {
                System.out.println(index + "th Hello");
                index++;
            }
        }
    }
}

