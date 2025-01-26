/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ex_1_3_10 {
    public static String transform(String s) {
        String[] items = s.split(" ");
        String result = "";
        Stack<String> ops = new Stack<>();

        for (String item : items) {
            if (item.equals("*") || item.equals("/")) {
                if (!ops.isEmpty() && (ops.peek().equals("*") || ops.peek().equals("/"))) {
                    result += ops.pop();
                }
                ops.push(item);
            }
            else if (item.equals("+") || item.equals("-")) {
                while (!ops.isEmpty()) {
                    result += ops.pop();
                }
                ops.push(item);
            }
            else result += item;
        }

        while (!ops.isEmpty()) {
            result += ops.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String s = " 1 + 2 + 3 * 4 + 5 * 6 / 7";
        System.out.println(transform(s));
    }
}
