/*
    If char is operand, add to output string
    If char is opening bracket, push to stack
    If char is closing bracket, pop all elements from stack and add them to output string
        until closing opening bracket is found
    If char is operator, pop all the elements from stack and add them to output string
        until operator with lower priority is found, push this operator to stack
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        Stack<Character> stack = new Stack<>();
        String output = "";
        for (char ch: s.toCharArray()) {
            System.out.println(ch);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                while (stack.size() > 0) {
                    if (ch == '+' || ch == '-') {
                        if (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '%' || stack.peek() == '+' || stack.peek() == '-'){
                            output = output + stack.pop();
                        }
                        else
                            break;
                    }
                    else {
                        if (stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '%'){
                            output = output + stack.pop();
                        }
                        else
                            break;
                    }
                }
                stack.push(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (stack.size() > 0) {
                    if (stack.peek() != '(')
                        output += stack.pop();
                    else
                    {
                        stack.pop();
                        break;
                    }
                }
            }
            else
                output += ch;
        }
        while (!stack.isEmpty()) {
            output += stack.pop();
        }
        System.out.println(output);
    }
}
