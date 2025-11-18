package problems.queue.easy;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution_225_Implement_Stack_By_Queue {

    static class MyStack {
        Queue<Integer> head;
        Queue<Integer> tail;

        public MyStack() {
            head = new ArrayDeque<>();
            tail = new ArrayDeque<>();
        }

        public void push(int x) {
            if(head.isEmpty()) {
                head.add(x);
                tail.add(x);
            } else {
                int top = head.remove();
                head.add(x);
                Queue<Integer> tailCopy = new ArrayDeque<>();
                tailCopy.add(top);
                for (Integer a: tail) {
                    tailCopy.add(a);
                }
                tail = tailCopy;
            }

        }

        public int pop() {
            int pop = head.remove();
            head.add(tail.remove());
            return pop;
        }

        public int top() {
            return head.element();
        }

        public boolean empty() {
            return tail.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }

}
