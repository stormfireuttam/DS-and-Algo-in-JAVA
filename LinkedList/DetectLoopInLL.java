package LinkedList;
/*
    Efficient approach using Floyd's Cycle Finding Algorithm
 */
public class DetectLoopInLL {
    public static boolean detectLoop(SingleLinkedList.Node head) {
        SingleLinkedList.Node slowPtr = head, fastPtr = head;
        while (slowPtr != null && fastPtr != null) {
            fastPtr = fastPtr.next;
            if (fastPtr == slowPtr)
                return true;
            if (fastPtr == null)
                return false;
            fastPtr = fastPtr.next;
            if (fastPtr == slowPtr)
                return true;
            slowPtr = slowPtr.next;
        }
        return false;
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(20);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 15);
        SingleLinkedList.addLast(head, 10);
        if (detectLoop(head))
            System.out.println("Loop exists in the Linked List");
        else
            System.out.println("Loop does not exists in the Linked List");
        head.next.next.next.next = head.next;
        if (detectLoop(head))
            System.out.println("Loop exists in the Linked List");
        else
            System.out.println("Loop does not exists in the Linked List");
    }
}
