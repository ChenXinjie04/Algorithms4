/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;

public class Ex_1_3_9 {

    public static String transform(String s) {
        Stack<String> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        String[] items = s.split(" ");
        for (String a : items) {
            if (a.equals(")")) {
                String v2 = vals.pop();
                String v1 = vals.pop();
                String op = ops.pop();
                String exp = "( " + v1 + " " + op + " " + v2 + " )";
                vals.push(exp);
            }
            else if (a.equals("+")) ops.push("+");
            else if (a.equals("-")) ops.push("-");
            else if (a.equals("*")) ops.push("*");
            else if (a.equals("/")) ops.push("/");
            else vals.push(a);
        }
        return vals.pop();
    }

    public static void main(String[] args) {
        String s = StdIn.readAll();
        System.out.println(transform(s));
    }
}
