package LinkedList;

public class ReverseBlockOfKNodesInLL {

    public static SingleLinkedList.Node reverseBlocks(SingleLinkedList.Node head, int k) {
        if (head == null)
            return null;
        SingleLinkedList.Node curr = head, prev = null, next = null;
        int i = 0;
        while (i < k && curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i ++;
        }
        if (next != null)
            head.next = reverseBlocks(next, k);
        return prev;
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
        head = reverseBlocks(head, 4);
        SingleLinkedList.displaySLL(head);
    }
}
