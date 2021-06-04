package LinkedList;

import java.util.HashMap;
import java.util.Scanner;

public class CloneLLWithRandomPointer {
    public static class Node {
        int data;
        Node next, random;
        Node(int data) {
            this.data = data;
            next = null;
            random = null;
        }
    }
    // Using extra space to deep clone a linked list with random pointer
    public static Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node newHead = new Node(-1);
        Node prev = newHead, curr = head;
        while (curr != null) {
            prev.next = new Node(curr.data);
            map.put(curr, prev.next);
            curr = curr.next;
            prev = prev.next;
        }
        newHead = newHead.next;
        curr = head;
        Node currNewHead = newHead;
        while (curr != null) {
            currNewHead.random = map.get(curr.random);
            currNewHead = currNewHead.next;
            curr = curr.next;
        }
        return newHead;
    }
    // Deep cloning a linked list with random pointer without extra space
    public static Node copyRandomList2(Node head) {
        Node curr = head, next = null, newNode = null;
        while (curr != null) {
            next = curr.next;
            newNode = new Node(curr.data);
            newNode.next = next;
            curr.next = newNode;
            curr = next;
        }
        curr = head;
        while (curr != null && curr.next != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }
        Node newHead = new Node(-1);
        Node prev = newHead;
        curr = head;
        while (curr != null && curr.next != null) {
            next = curr.next.next;
            prev.next = curr.next;
            prev = curr.next;
            curr = next;
        }
        newHead = newHead.next;
        return newHead;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Node[] arr = new Node[n];
        Node prev = null;

        for (int i = 0; i < n; i++) {
            arr[i] = new Node(0);
            if (prev != null)
                prev.next = arr[i];
            prev = arr[i];
        }

        for (int i = 0; i < n; i++) {
            int data = scn.nextInt();
            int idx = scn.nextInt();

            arr[i].data = data;
            if(idx != -1) arr[i].random = arr[idx];
        }

        Node head = copyRandomList(arr[0]);
        while (head != null) {
            System.out.print("(" + head.data + ", " + (head.random != null ? head.random.data : -1) + ") ");
            head = head.next;
        }
        System.out.println();
        head = copyRandomList2(arr[0]);
        while (head != null) {
            System.out.print("(" + head.data + ", " + (head.random != null ? head.random.data : -1) + ") ");
            head = head.next;
        }
    }
}
