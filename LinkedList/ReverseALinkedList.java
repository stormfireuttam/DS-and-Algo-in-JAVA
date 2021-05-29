package LinkedList;

public class ReverseALinkedList {
    public static SingleLinkedList.Node reverseList(SingleLinkedList.Node head) {
        SingleLinkedList.Node curr = null, next = null;
        while (head != null) {
            next = head.next;
            head.next = curr;
            curr = head;
            head = next;
        }
        return curr;
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
        head = reverseList(head);
        SingleLinkedList.displaySLL(head);
    }
}
