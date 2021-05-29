package LinkedList;

public class NthNodeFromEnd {
    public static SingleLinkedList.Node findNthFromEnd(SingleLinkedList.Node head, int n) {
        SingleLinkedList.Node fastPtr = head, slowPtr = head;
        for (int i = 1; i < n; i++) {
            fastPtr = fastPtr.next;
        }
        while (fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        return slowPtr;
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(1);
        SingleLinkedList.addLast(head, 2);
        SingleLinkedList.addLast(head, 3);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 5);
        SingleLinkedList.addLast(head, 6);
        SingleLinkedList.addLast(head, 7);
        SingleLinkedList.addLast(head, 8);
        SingleLinkedList.addLast(head, 9);
        SingleLinkedList.addLast(head, 10);
        SingleLinkedList.displaySLL(head);
        System.out.println(findNthFromEnd(head, 4).data);
        System.out.println(findNthFromEnd(head, 7).data);
    }
}
