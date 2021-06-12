package Stack;

public class LinkedListImplementation {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node top;
    LinkedListImplementation() {
        this.top = null;
    }
    public void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }
    public int pop() {
        if (top == null)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        int val = top.data;
        return val;
    }
}
