/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class Ex_1_2_2 {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i = 0;
        Interval1D[] intervals = new Interval1D[N];

        for (i = 0; i < N; i++) {
            double min = StdIn.readDouble();
            double max = StdIn.readDouble();
            intervals[i] = new Interval1D(min, max);
        }

        for (i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    System.out.println(intervals[i] + " intersects " + intervals[j]);
                }
            }
        }
    }
}
