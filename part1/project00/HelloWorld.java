import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class HelloWorld {
    public static void main(String[] args) {
        int N = 50;
        int i = 0;
        double[] a = new double[N];
        for (i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        Arrays.sort(a);
        for (i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }
}
