/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        // Stores the (x1, y1) (x2, y2) degree arguments
        double xOne = Double.parseDouble(args[0]);
        double yOne = Double.parseDouble(args[1]);
        double xTwo = Double.parseDouble(args[2]);
        double yTwo = Double.parseDouble(args[3]);

        // Mean radius of the Earth (in kilometers)
        double r = 6371.0;

        // Haversine Formula
        double xLat = Math.toRadians(xTwo - xOne);
        double yLon = Math.toRadians(yTwo - yOne);

        double a = (Math.sin(xLat / 2.0) * Math.sin(xLat / 2.0))
                + Math.cos(Math.toRadians(xOne)) * Math
                .cos(Math.toRadians(xTwo)) * (Math.sin(yLon / 2.0) * Math.sin(yLon / 2.0));
        double c = 2.0 * Math.asin(Math.sqrt(a));
        double distance = r * c;

        // Output distance
        System.out.println(distance + " kilometers");
    }
}
