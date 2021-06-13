/*
    In this we only push the elements onto the minStack if they are the less than the value
        on the top of the stack
    We pop the elements from minStack if the top element of minStack and mainStack are equal
    Space Complexity better than approach 01
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMinimumFromStackApproach02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        for (int i = 0; i < 6; i ++) {
            int x = Integer.parseInt(sc.nextLine());
            mainStack.push(x);
            if (minStack.size() == 0 || minStack.peek() >= x) {
                minStack.push(x);
            }
        }
        while (mainStack.size() > 0) {
            System.out.println(mainStack.peek() + " " + minStack.peek());
            int x = mainStack.pop();
            if (x ==  minStack.peek())
                minStack.pop();
        }
    }
}
