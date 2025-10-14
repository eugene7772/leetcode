package other.linkedListCycle;

import other.addTwoNumbers.ListNode;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2, new ListNode(0, new ListNode(-4, head)));
        boolean res = solution(head);
        System.out.println(res);
    }

    private static boolean solution(ListNode head) {
        ListNode sl = head;
        ListNode fl = head;
        while (fl != null && fl.next != null) {
            fl = fl.next.next;
            sl = sl.next;
            if(fl == sl) {
                return true;
            }
        }
        return false;
    }
}
