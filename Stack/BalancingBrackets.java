/*
    If char is opening bracket push to stack
    If char is closing bracket
        i) If stack is empty show error
        ii) If top of stack does not matches the bracket show error
        iii) If top of stack matches the bracket pop the bracket
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        String s = sc.nextLine();
        boolean balanced = true;
        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            else {
                if (stack.size() == 0)
                {
                    balanced = false;
                    break;
                }
                char c = stack.peek();
                if ((c == '(' && ch == ')') || (c == '{' && ch == '}') || (c == '[' && ch == ']')){
                    stack.pop();
                }
                else {
                    balanced = false;
                    break;
                }
            }
        }
        if (stack.size() > 0)
            balanced = false;
        if (balanced)
            System.out.println("Input has balanced brackets");
        else
            System.out.println("Input does not have balanced brackets");
    }
}
