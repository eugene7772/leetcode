package other.addTwoNumbers;

public class Main {
    public static void main(String[] args) {
        ListNode res = Solution.addTwoNumbers(new ListNode(2, new ListNode(4, new ListNode(3))),
                new ListNode(5, new ListNode(6, new ListNode(4))));
        System.out.println(res);
    }
}