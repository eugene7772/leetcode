package problems.linkedList.easy;

import other.addTwoNumbers.ListNode;

public class Solution_21_Merge_Two_Sorted_List {
    public static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if(list1.val < list2.val) {
            ListNode res = new ListNode(list1.val);
            return merge2(res, res, list1.next, list2);
        } else {
            ListNode res = new ListNode(list2.val);
            return merge2(res, res, list1, list2.next);
        }
    }

    public static ListNode merge2(ListNode res, ListNode next, ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return res;
        }
        if(list1 == null) {
            ListNode n1 = new ListNode(list2.val);
            next.next = n1;
            return merge2(res, next.next, list1, list2.next);
        } else if (list2 == null) {
            ListNode n1 = new ListNode(list1.val);
            next.next = n1;
            return merge2(res, next.next, list1.next, list2);
        }
        if(list1.val < list2.val) {
            ListNode n1 = new ListNode(list1.val);
            next.next = n1;
            return merge2(res, next.next, list1.next, list2);
        } else {
            ListNode n1 = new ListNode(list2.val);
            next.next = n1;
            return merge2(res, next.next, list1, list2.next);
        }
    }

    public static void main(String[] args) {
        System.out.println(mergeTwoLists2(new ListNode(5), new ListNode(1, new ListNode(2, new ListNode(4)))));
    }
}
