/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ResizingArrayQueueOfStrings {
    private String[] a;
    private int N;

    ResizingArrayQueueOfStrings() {
        a = new String[1];
        N = 0;
    }

    public void resize(int size) {
        String[] temp = new String[size];
        for (int i = 0; i < N; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    public void enqueue(String item) {
        if (N == a.length) {
            resize(a.length * 2);
        }
        a[N++] = item;
    }

    public String dequeue() {
        String item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public static void main(String[] args) {

    }
}
