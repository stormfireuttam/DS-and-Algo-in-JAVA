package LinkedList;

public class FindStartNodeOfCycleInLL {
    public static SingleLinkedList.Node findStartNodeOfCycle(SingleLinkedList.Node head) {
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
            return slowPtr;
        }
        return null;
    }
    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(20);
        SingleLinkedList.addLast(head, 4);
        SingleLinkedList.addLast(head, 15);
        SingleLinkedList.addLast(head, 10);
        head.next.next.next.next = head.next;
        System.out.println(findStartNodeOfCycle(head).data);
    }
}
