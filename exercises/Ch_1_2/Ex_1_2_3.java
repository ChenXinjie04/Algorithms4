/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_2_3 {
    public static Interval1D generateInterval1D(double min, double max) {
        double left = StdRandom.uniform(min, max);
        double right = StdRandom.uniform(min, max);
        if (left > right) {
            double temp = left;
            left = right;
            right = temp;
        }
        return new Interval1D(left, right);
    }

    public static Interval2D generateInterval2D(double min, double max) {
        Interval1D x = generateInterval1D(min, max);
        Interval1D y = generateInterval1D(min, max);
        return new Interval2D(x, y);
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int numberOfIntersect = 0;
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Interval2D[] intervals = new Interval2D[N];

        for (int i = 0; i < N; ++i) {
            intervals[i] = generateInterval2D(min, max);
            intervals[i].draw();
        }

        for (int i = 0; i < N; ++i) {
            for (int j = i + 1; j < N; ++j) {
                if (intervals[i].intersects(intervals[j])) {
                    numberOfIntersect++;
                }
            }
        }

        System.out.println("Number of intersecting pairs: " + numberOfIntersect);
    }
}
