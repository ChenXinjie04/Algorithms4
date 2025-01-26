/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class EvaluatePostfix {
    public static double evaluate(String s) {
        String[] items = s.split(" ");
        Stack<Double> vals = new Stack<>();

        for (String item : items) {
            if (item.equals("+")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 + v2);
            }
            else if (item.equals("*")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v1 * v2);
            }
            else if (item.equals("/")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v2 / v1);
            }
            else if (item.equals("-")) {
                double v2 = vals.pop();
                double v1 = vals.pop();
                vals.push(v2 - v1);
            }
            else vals.push(Double.parseDouble(item));
        }

        return vals.pop();
    }

    public static void main(String[] args) {
        String s = "1 2 + 3 4 *";
        System.out.println(evaluate(s));
    }
}
