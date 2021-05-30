package LinkedList;

public class IntersectionPointInLL {
    public static SingleLinkedList.Node findIntersection(SingleLinkedList.Node headA, SingleLinkedList.Node headB) {
        int lenA = 0, lenB = 0;
        SingleLinkedList.Node currA = headA, currB = headB;
        while (currA != null) {
            lenA += 1;
            currA = currA.next;
        }
        while (currB != null) {
            lenB += 1;
            currB = currB.next;
        }
        int diff = Math.abs(lenA - lenB);
        currA = headA;
        currB = headB;
        if (lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                currA = currA.next;
            }
        }
        else {
            for (int i = 0; i < diff; i++) {
                currB = currB.next;
            }
        }

        while (currA != null && currB != null) {
            if (currA.data == currB.data) {
                return currA;
            }
            currA = currA.next;
            currB = currB.next;
        }
        return null;
    }

    public static void main(String[] args) {
        SingleLinkedList.Node headA = new SingleLinkedList.Node(1);
        SingleLinkedList.addLast(headA, 2);
        SingleLinkedList.addLast(headA, 3);
        SingleLinkedList.addLast(headA, 4);
        SingleLinkedList.Node headB = new SingleLinkedList.Node(10);
        SingleLinkedList.addLast(headB, 9);
        SingleLinkedList.addLast(headB, 8);
        SingleLinkedList.addLast(headB, 7);
        SingleLinkedList.addLast(headB, 6);
        SingleLinkedList.Node headC = new SingleLinkedList.Node(5);
        SingleLinkedList.addLast(headC, 11);
        SingleLinkedList.addLast(headC, 12);
        headA.next.next.next.next = headC;
        headB.next.next.next.next.next = headC;
        if (findIntersection(headA, headB) != null)
            System.out.println(findIntersection(headA, headB).data);
        else
            System.out.println("The Linked Lists do not intersect");
    }
}
