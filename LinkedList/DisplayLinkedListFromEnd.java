package LinkedList;

public class DisplayLinkedListFromEnd {
    public static void printFromEnd(SingleLinkedList.Node head) {
        if (head == null) {
            System.out.print("NULL");
            return;
        }
        printFromEnd(head.next);
        System.out.print(" <- " + head.data);
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
        printFromEnd(head);
    }
}
