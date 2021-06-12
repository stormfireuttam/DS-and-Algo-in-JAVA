package Stack;

import java.util.Scanner;

public class ArrayImplementation {
    static class ArrayStack {
        int top;
        int capacity;
        int arr[];
        ArrayStack(int capacity) {
            top = -1;
            this.capacity = capacity;
            arr = new int[capacity];
        }
        void push(int data) {
            if (isFullStack(this))
            {
                System.out.println("Stack Overflow");
                return;
            }
            top = top + 1;
            arr[top] = data;
        }
        int pop() {
            if (isEmptyStack(this))
            {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = arr[top];
            top = top - 1;
            return val;
        }
    }
    public static boolean isEmptyStack(ArrayStack s) {
        if (s.top == -1)
            return true;
        return false;
    }
    public static boolean isFullStack(ArrayStack s) {
        if (s.top + 1 == s.capacity)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayStack s = new ArrayStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
