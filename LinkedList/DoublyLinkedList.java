package LinkedList;

public class DoublyLinkedList {
    public static class Node {
        int data;
        Node next, prev;
        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static void addLast(Node head, int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node curr = head;
        Node temp = new Node(data);
        while (curr != null && curr.next != null) {
            curr = curr.next;
        }
        temp.prev = curr;
        curr.next = temp;
        return;
    }

    public static Node addFirst(Node head, int data) {
        Node temp = new Node(data);
        if (head == null)
        {
            head = temp;
            return head;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    public static Node addAt(Node head, int pos, int data) {
        if (pos == 1)
            head = addFirst(head, data);
        else {
            Node temp = new Node(data);
            Node curr = head;
            int currPos = 1;
            while (curr != null && curr.next != null) {
                if (currPos + 1 == pos) {
                    temp.prev = curr;
                    temp.next = curr.next;
                    curr.next = temp;
                    break;
                }
                curr = curr.next;
                currPos ++;
            }
            if (currPos + 1 == pos)
            {
                curr.next = temp;
                temp.prev = curr;
            }
        }
        return head;
    }

    public static Node removeFirst(Node head) {
       if (head == null)
           return head;
       head = head.next;
       return head;
    }

    public static Node removeLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node curr = head;
        while (curr.next != null && curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }

    public static Node removeAt(Node head, int pos) {
        if (pos == 1) {
            head = removeFirst(head);
        }
        else  {
            Node curr = head;
            int currPos = 1;
            while (curr.next != null && curr.next.next != null) {
                if (currPos + 1 == pos) {
                    curr.next = curr.next.next;
                    break;
                }
                curr = curr.next;
                currPos ++;
            }
            if (currPos + 1 == pos) {
                curr.next = null;
            }
        }
        return head;
    }

    public static void displayDLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node head = new Node(15);
        addLast(head, 7);
        addLast(head, 40);
        displayDLL(head);
        head = addFirst(head, 4);
        displayDLL(head);
        head = addAt(head, 3, 11);
        displayDLL(head);
        head = addAt(head, 6, 50);
        displayDLL(head);
        head = removeFirst(head);
        displayDLL(head);
        head = removeLast(head);
        displayDLL(head);
        head = removeAt(head, 4);
        displayDLL(head);
    }
}
