/*
    If character is operand push to stack
    If character is operator pop the last two elements and push the result to the stack
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '%' || ch == '/')
            {
                if (stack.size() < 2)
                {
                    System.out.println("Invalid expression");
                    break;
                }
                else {
                    int b = ((int)stack.pop()) - 48;
                    int a = (int)stack.pop() - 48;
                    switch (ch) {
                        case '+' :
                            stack.push((char)(a + b + 48));
                            break;
                        case '-' :
                            stack.push((char)(a - b + 48));
                            break;
                        case '*':
                            stack.push((char)(a * b + 48));
                            break;
                        case '/':
                            stack.push((char)(a / b + 48));
                            break;
                        case '%':
                            stack.push((char)(a % b + 48));
                    }
                }
            }
            else {
                stack.push(ch);
            }
        }
        System.out.println(stack.pop());
    }
}
