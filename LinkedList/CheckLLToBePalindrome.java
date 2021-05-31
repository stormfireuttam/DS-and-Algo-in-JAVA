package LinkedList;

public class CheckLLToBePalindrome {
    public static boolean isPalindrome(SingleLinkedList.Node head) {
        SingleLinkedList.Node fastPtr = head, slowPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
        }
        SingleLinkedList.Node listA = reverse(head, slowPtr);
        SingleLinkedList.displaySLL(listA);
        if (fastPtr != null) {
            slowPtr = slowPtr.next;
        }
        while (listA != null && slowPtr != null) {
            if (listA.data != slowPtr.data)
                return false;
            listA = listA.next;
            slowPtr = slowPtr.next;
        }
        if (listA != null || slowPtr != null)
            return false;
        return true;
    }

    private static SingleLinkedList.Node reverse(SingleLinkedList.Node head, SingleLinkedList.Node slowPtr) {
        SingleLinkedList.Node next = null, curr = null;
        while (head != slowPtr) {
            next = head.next;
            head.next = curr;
            curr = head;
            head = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        SingleLinkedList.Node head = new SingleLinkedList.Node(1);
        SingleLinkedList.addLast(head, 1);
        SingleLinkedList.addLast(head, 2);
        SingleLinkedList.addLast(head, 3);
        SingleLinkedList.addLast(head, 2);
        SingleLinkedList.addLast(head, 1);
        SingleLinkedList.addLast(head, 1);
        System.out.println(isPalindrome(head));
    }
}
