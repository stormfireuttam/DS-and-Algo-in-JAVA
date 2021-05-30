package LinkedList;

public class ReverseLLInPair {
    public static SingleLinkedList.Node reverseInPair(SingleLinkedList.Node head) {
        SingleLinkedList.Node curr = head;
        int temp;
        while (curr != null && curr.next != null) {
            temp = curr.data;
            curr.data = curr.next.data;
            curr.next.data = temp;
            curr = curr.next.next;
        }
        return head;
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
        head = reverseInPair(head);
        SingleLinkedList.displaySLL(head);
    }
}
