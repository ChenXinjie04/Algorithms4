/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class VisualCounter {
    private final String name;
    private int count, N, max;

    public VisualCounter(String id, int N, int max) {
        name = id;
        count = 0;
        this.N = N;
        this.max = max;
    }

    public void increment() {
        if (count < max && count < N) {
            count++;
            N++;
        }
    }

    public void decrement() {
        if (count > -max && count < N) {
            count--;
            N++;
        }
    }

    public int tally() {
        return count;
    }

    public static void main(String[] args) {

    }
}
