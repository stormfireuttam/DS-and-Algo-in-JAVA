package Stack;

public class DynamicArrayImplementation {
    static class ArrayStack {
        int arr[];
        int top;
        int capacity;
        ArrayStack(int cap) {
            top = -1;
            capacity = cap;
            arr = new int[cap];
        }
        void push(int data) {
            if (top + 1 == capacity)
            {
                capacity = 2 * capacity;
                int temp[] = arr;
                arr = new int[capacity];
                for (int i = 0; i < temp.length; i ++) {
                    arr[i] = temp[i];
                }
            }
            top ++;
            arr[top] = data;
        }
        int pop() {
            if (top == -1)
            {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = arr[top];
            top --;
            return val;
        }
    }
    public static boolean isEmpty(ArrayStack s) {
        if (s.top == -1)
            return true;
        return false;
    }
    public static boolean isFull(ArrayStack s) {
        if (s.top + 1 == s.capacity)
            return true;
        return false;
    }
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(1);
        s.push(3);
        System.out.println(isFull(s));
        s.push(4);
        System.out.println(isFull(s));
        s.push(5);
        System.out.println(s.pop());
        System.out.println(isFull(s));
    }
}
