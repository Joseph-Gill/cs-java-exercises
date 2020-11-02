/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("log n \tn \tn log n\tn^2 \tn^3");
        for (long index = 2; index <= 2048; index *= 2) {
            System.out.print((int) Math.log(index));
            System.out.print('\t');
            System.out.print(index);
            System.out.print('\t');
            System.out.print((int) (index * Math.log(index)));
            System.out.print('\t');
            System.out.print(index * index);
            System.out.print('\t');
            System.out.print(index * index * index);
            System.out.println();
        }
    }
}

