package problems.pointers.easy;

import other.addTwoNumbers.ListNode;

public class Solution_160_Пересечение_двух_связанных_списков {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA, b = headB;
        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }
        return a;
    }

    public static void main(String[] args) {
        ListNode intersection = new ListNode(8);
        intersection.next = new ListNode(4, new ListNode(5, null));

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1, intersection);

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6, new ListNode(1, intersection));
        System.out.println(getIntersectionNode(headA, headB));
    }
}
