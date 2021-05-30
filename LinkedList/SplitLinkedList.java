package LinkedList;

public class SplitLinkedList {
    public static void split(SingleLinkedList.Node head) {
        SingleLinkedList.Node fastPtr = head, slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        SingleLinkedList.Node headB = slowPtr.next;
        slowPtr.next = null;
        SingleLinkedList.displaySLL(head);
        SingleLinkedList.displaySLL(headB);
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(1);
        SingleLinkedList.addLast(head, 2);
        SingleLinkedList.addLast(head, 3);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 5);
        SingleLinkedList.addLast(head, 6);
        SingleLinkedList.addLast(head, 7);
        split(head);
    }
}
