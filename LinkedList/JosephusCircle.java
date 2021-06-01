/*
    N people have decided to elect a leader by arranging themselves in a circle and
    eliminating every Mth person around the circle
 */
package LinkedList;

public class JosephusCircle {
    public static void lastNodeRemaining(CircularLinkedList.Node head, int m) {
        CircularLinkedList.Node curr = head.next;
        int size = 1, count = 1;
        while (curr != head) {
            curr = curr.next;
            size ++;
        }
        System.out.println("Size " + size);
        curr = head;
        CircularLinkedList.Node prev = null;
        while (size > 1) {
            while (count != m) {
                prev = curr;
                curr = curr.next;
                count ++;
            }
            if (size == 2){
                System.out.println(prev.data);
                return;
            }
            count = 1;
            prev.next = curr.next;
            curr = curr.next;
            size --;
        }
    }
    public static void main(String[] args) {
        CircularLinkedList.Node head = new CircularLinkedList.Node(1);
        CircularLinkedList.addLast(head, 2);
        CircularLinkedList.addLast(head, 3);
        CircularLinkedList.addLast(head, 4);
        CircularLinkedList.addLast(head, 5);
        CircularLinkedList.addLast(head, 6);
        CircularLinkedList.addLast(head, 7);
        CircularLinkedList.addLast(head, 8);
        CircularLinkedList.addLast(head, 9);
        CircularLinkedList.addLast(head, 10);
        CircularLinkedList.addLast(head, 11);
        CircularLinkedList.addLast(head, 12);
        CircularLinkedList.addLast(head, 13);
        CircularLinkedList.addLast(head, 14);
        lastNodeRemaining(head, 2);

    }
}
