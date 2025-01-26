/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class Ex_1_3_12 {
    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        while (!stack.isEmpty()) {
            stack1.push(stack.pop());
        }

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        return stack2;
    }

    public static void main(String[] args) {
        // The output should be "c b a"
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        Stack<String> copyStack = copy(stack);
        while (!copyStack.isEmpty()) {
            System.out.print(copyStack.pop() + " ");
        }
    }
}
