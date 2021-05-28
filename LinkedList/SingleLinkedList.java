package LinkedList;

import java.util.Scanner;

public class SingleLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node addFirst(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        return head;
    }
    public static void addLast(Node head, int data) {
        Node temp = new Node(data);
        Node curr = head;
        if (curr == null) {
            head = temp;
        }
        else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }
    public static Node addAt(Node head, int pos, int data) {
        if (pos == 1) {
            head = addFirst(head, data);
            return head;
        }
        Node curr = head;
        Node temp = new Node(data);
        int currPos = 1;
        while (curr != null && curr.next != null) {
            if (currPos + 1 == pos)
            {
                temp.next = curr.next;
                curr.next = temp;
                break;
            }
            currPos ++;
            curr = curr.next;
        }
        return head;
    }
    public static void displaySLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static Node removeFirst(Node head) {
        if (head != null)
            head = head.next;
        return head;
    }
    public static Node removeLast(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    public static Node removeAt(Node head, int pos) {
        if (pos == 1) {
            head = removeFirst(head);
            return head;
        }
        Node curr = head;
        int currPos = 1;
        while (curr != null && curr.next != null) {
            if (currPos + 1 == pos) {
                curr.next = curr.next.next;
            }
            currPos ++;
            curr = curr.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(15);
        addLast(head, 7);
        addLast(head, 20);
        displaySLL(head);
        head = addFirst(head, 5);
        displaySLL(head);
        head = addAt(head, 2, 6);
        displaySLL(head);
        head = addAt(head, 1, 2);
        displaySLL(head);
        head = addAt(head, 6, 18);
        displaySLL(head);
        head = removeFirst(head);
        displaySLL(head);
        head = removeLast(head);
        displaySLL(head);
        head = removeAt(head, 4);
        displaySLL(head);
    }
}
