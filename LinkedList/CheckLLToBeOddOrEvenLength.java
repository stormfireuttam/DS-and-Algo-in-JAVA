package LinkedList;

public class CheckLLToBeOddOrEvenLength {
    public static boolean lengthIsEven(SingleLinkedList.Node head) {
        SingleLinkedList.Node curr = head;
        while (head != null && head.next != null) {
            head = head.next.next;
        }
        if (head == null)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(1);
        SingleLinkedList.addLast(head, 2);
        SingleLinkedList.addLast(head, 3);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 8);
        SingleLinkedList.addLast(head, 9);
        SingleLinkedList.addLast(head, 10);
        if (lengthIsEven(head)) {
            System.out.println("LinkedList is of Even length");
        }
        else {
            System.out.println("LinkedList is of Odd Length");
        }
        SingleLinkedList.addLast(head, 12);
        if (lengthIsEven(head)) {
            System.out.println("LinkedList is of Even length");
        }
        else {
            System.out.println("LinkedList is of Odd Length");
        }
    }
}
