/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class FixedCapacityStack<Item> {
    private Item[] items;
    private int N;

    FixedCapacityStack(int cap) {
        items = (Item[]) new Object[cap];
        N = 0;
    }

    public void push(Item item) {
        items[N++] = item;
    }

    public Item pop() {
        Item removed = items[--N];
        items[N] = null;
        return removed;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public static void main(String[] args) {
        FixedCapacityStack<String> s = new FixedCapacityStack<>(100);
        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            }
            else {
                System.out.print(s.pop() + " ");
            }
        }
        System.out.println("( with " + s.size() + " left )");
    }
}
