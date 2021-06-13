/*
    By using an auxiliary space to maintaining the min at each position
    Space Complexity : O(n)
 */
package Stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMinimumFromStackApproach01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> mainSt = new Stack<>();
        Stack<Integer> minSt = new Stack<>();
        for (int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            mainSt.push(x);
            if (minSt.size() < 1)
                minSt.push(x);
            else {
                minSt.push(Math.min(x, minSt.peek()));
            }
        }
        while (mainSt.size() > 0) {
            System.out.println(mainSt.pop() + " <==> " + minSt.pop());
        }
    }
}
