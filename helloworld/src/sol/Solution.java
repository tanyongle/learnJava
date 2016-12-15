package sol;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty()) {
            return 0;
        } else {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            int one = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return one;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.pop());
        solution.push(1);
        solution.push(2);
        solution.push(3);
        solution.push(4);

        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        System.out.println(solution.pop());
    }


}
