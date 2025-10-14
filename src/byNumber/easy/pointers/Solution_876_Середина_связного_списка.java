package byNumber.easy.pointers;

import other.addTwoNumbers.ListNode;

public class Solution_876_Середина_связного_списка {

    public static ListNode middleNode(ListNode head) {
        int n = getLength(head, 0);
        int middle = n/2;
        System.out.println(middle);
        return getMiddle(head, middle);
    }

    public static int getLength(ListNode head, int n) {
        n++;
        if(head.next == null) {
            return n;
        }
        return getLength(head.next, n);
    }

    public static ListNode getMiddle(ListNode head, int middle) {
        if(middle == 0) {
            return head;
        }
        middle--;
        return getMiddle(head.next, middle);
    }

    //Тут смысл что fast идет по списку в 2 раза быстрее и получается slow остановится на середине когда fast дойдет до конца
    public ListNode middleNode2(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(middleNode(head));
    }
}
