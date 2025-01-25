/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ex_1_2_9 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        Counter c = new Counter("BinarySearch");
        BinarySearch.rank(5, a, c);
        System.out.println(c);
    }
}
