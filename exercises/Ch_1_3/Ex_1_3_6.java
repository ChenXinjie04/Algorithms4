/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.LinkedList;

public class Ex_1_3_6 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        LinkedList<Character> queue = new LinkedList<>();
        char[] a = { 'o', 'l', 'l', 'e', 'h' };

        for (char c : a) queue.add(c);
        while (!queue.isEmpty()) stack.push(queue.remove());
        while (!stack.isEmpty()) queue.add(stack.pop());
        for (char c : queue) System.out.print(c);
    }
}
