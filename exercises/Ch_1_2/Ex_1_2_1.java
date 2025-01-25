/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class Ex_1_2_1 {
    public static double distance(Point2D p1, Point2D p2) {
        return p1.distanceTo(p2);
    }

    public static double minDistance(Point2D[] points) {
        double min = Double.POSITIVE_INFINITY;
        int p1 = 0, p2 = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double dist = distance(points[i], points[j]);
                if (dist < min) {
                    min = dist;
                    p1 = i;
                    p2 = j;
                }
            }
        }
        for (int i = 0; i < points.length; i++) {
            if (i == p1 || i == p2) {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else {
                StdDraw.setPenColor(StdDraw.BLACK);
            }
            points[i].draw();
        }
        return min;
    }

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Point2D[] points = new Point2D[N];

        StdDraw.setPenRadius(0.01);

        for (int i = 0; i < N; i++) {
            points[i] = new Point2D(StdRandom.random(), StdRandom.random());
        }
        System.out.println(minDistance(points));
    }
}
