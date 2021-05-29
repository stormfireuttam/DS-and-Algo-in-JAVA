package LinkedList;

public class LengthOfCycle {
    public static int findLengthOfCycle(SingleLinkedList.Node head) {
        SingleLinkedList.Node slowPtr = head, fastPtr = head;
        boolean cycleFound = false;
        while (slowPtr != null && fastPtr != null) {
            fastPtr = fastPtr.next;
            if (slowPtr == fastPtr)
            {
                cycleFound = true;
                break;
            }
            if (fastPtr == null)
                break;
            fastPtr = fastPtr.next;
            if (slowPtr == fastPtr)
            {
                cycleFound = true;
                break;
            }
            slowPtr = slowPtr.next;
        }
        if (cycleFound == true) {
            fastPtr = fastPtr.next;
            int length = 1;
            while (slowPtr != fastPtr) {
                length ++;
                fastPtr = fastPtr.next;
            }
            return length;
        }
        return 0;
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(20);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 15);
        SingleLinkedList.addLast(head, 10);
        SingleLinkedList.addLast(head,12);
        SingleLinkedList.addLast(head, 11);
        SingleLinkedList.addLast(head, 9);
        head.next.next.next.next.next.next = head.next;
        System.out.println(findLengthOfCycle(head));
    }
}
