package other.mergeSoertedLists;

import other.addTwoNumbers.ListNode;

public class Solution {

    public static void main(String[] args) {
        ListNode[] lists = {new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))};
        ListNode res = solution(lists);
        System.out.println(res);
    }

    private static ListNode solution(ListNode[] lists) {
        ListNode ret = null;
        ListNode retHead = null;

        if (lists.length == 0) return retHead;

        boolean iterating = true;

        while (iterating) {
            int min = 0;
            for (int i = 0; i < lists.length; i++) {
                ListNode listI = lists[i];
                ListNode listMin = lists[min];
                if (listI != null && (listMin == null || lists[i].val < lists[min].val)) {
                    min = i;
                }
            }

            if (lists[min] == null) {
                iterating = false;
            } else {
                if (ret == null) {
                    ret = new ListNode(lists[min].val);
                    retHead = ret;
                } else {
                    ret.next = new ListNode(lists[min].val);
                    ret = ret.next;
                }
                lists[min] = lists[min].next;
            }
        }

        return retHead;
    }
}
