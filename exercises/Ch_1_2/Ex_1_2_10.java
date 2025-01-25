/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_2_10 {
    public static void main(String[] args) {
        int N = 10;
        int i;
        VisualCounter vc = new VisualCounter("Counter", N, 5);
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(0.01);
        for (i = 0; i < N; i++) {
            int rand = (int) (StdRandom.uniform() * 2);
            if (rand == 0) {
                vc.increment();
            }
            else {
                vc.decrement();
            }
            StdDraw.point(i, vc.tally());
        }
    }
}
