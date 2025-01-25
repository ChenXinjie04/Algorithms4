/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a, Counter counter) {
        int lo = 0;
        int hi = a.length - 1;

        Arrays.sort(a);
        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}
