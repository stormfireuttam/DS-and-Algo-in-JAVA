package LinkedList;

public class CircularLinkedList {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = this;
        }
    }
    public static int countNodes(Node head) {
        if (head == null)
            return 0;
        Node curr = head;
        int count = 0;
        do {
            count ++;
            curr = curr.next;
        } while (curr != head);
        return count;
    }
    public static Node addLast(Node head, int data) {
        Node temp = new Node(data);
        temp.next = temp;
        if (head == null)
            return temp;
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = head;
        return head;
    }
    public static Node addFirst(Node head, int data) {
        Node temp = new Node(data);
        temp.next = temp;
        if (head == null)
            return temp;
        temp.next = head;
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = temp;
        head = temp;
        return head;
    }
    public static void displayCLL(Node head) {
        Node curr = head;
        do {
            if (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
        }while (curr != head);
        System.out.println("NULL");
    }
    public static Node removeLast(Node head) {
        if (head == null || head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head && curr.next.next != head) {
            curr = curr.next;
        }
        curr.next = head;
        return head;
    }
    public static Node removeFirst(Node head) {
        if (head == null || head.next == head) {
            return null;
        }
        Node curr = head;
        while (curr.next != head) {
            curr = curr.next;
        }
        curr.next = head.next;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head = addLast(head, 5);
        head = addLast(head, 6);
        head = addLast(head, 7);
        head = addLast(head, 8);
        displayCLL(head);
        System.out.println(countNodes(head));
        head = addFirst(head, 3);
        head = addFirst(head, 2);
        displayCLL(head);
        head = removeLast(head);
        head = removeFirst(head);
        displayCLL(head);
    }
}
