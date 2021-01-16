package AZ_0116;

import java.util.Stack;

//使用递归函数,不能使用其他数据结构
public class ThreeReverseStack {

    //1.将栈stack的栈底元素返回并移除
    public static int getAndRemoveLastElement(Stack<Integer> stack) {
        int res = stack.pop();
        if (stack.isEmpty()) {
            return res;
        } else {
            int last = getAndRemoveLastElement(stack);
            stack.push(res);
            return last;
        }
    }

    //2.逆序
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int i = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
}
