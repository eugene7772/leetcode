package other.addTwoNumbers;


public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode curr = head;
        var overf = 0;
        var l = l1;
        var r = l2;
        while (l != null || r != null) {
            int lVal = l== null ? 0 : l.val;
            int rVal = r== null ? 0 : r.val;
            int res = lVal + rVal + overf;
            overf = res/10;
            curr.next = new ListNode(res%10);
            curr = curr.next;

            l = l != null ? l.next : null;
            r = r != null ? r.next : null;
        }

        if (overf > 0) {
            curr.next = new ListNode(overf);
        }
        return head.next;
    }

    private static int getValue(ListNode node) {
        if (node.next == null) {
            return node.val;
        } else {
            int number = getValue(node.next);
            return number * 10 + node.val;
        }
    }
}
