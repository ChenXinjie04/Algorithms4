/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Parentheses {
    public static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == '[') stack.push(c);
            else if (c == '{') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = StdIn.readAll();
        System.out.println(check(s));
    }
}
