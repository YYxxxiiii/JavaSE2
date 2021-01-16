package AZ_0116;

import java.util.Stack;

/**
 * push插入
 * pop删除
 * peek看并不删除
 */
public class OneMyStack {
    private Stack<Integer> stackData = new Stack<>();
    private Stack<Integer> stackMin = new Stack<>();

    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= getMin()) {
            stackMin.push(newNum);
        } else {
            stackData.push(newNum);
        }
    }

    public int pop() {
        if (stackData.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        int value = stackData.pop();
        //value只会出现大于或等于stackMin的栈顶元素
        if (value == getMin()) {
            stackMin.pop();
        }
        return value;
    }


    private int getMin() {
        if (stackMin.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return stackMin.peek();
    }



    //第二种
    public void push2(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum < getMin()) {
            stackMin.push(newNum);
        } else {
            int newMin = stackMin.peek();
            stackMin.push(newMin);
        }
    }

    public int pop2(){
        if (stackData.isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        stackMin.pop();
        return stackData.pop();
    }




//    private Stack<Integer> A = new Stack<>();
//    private Stack<Integer> B = new Stack<>();
//
//    //将元素 x 推入栈中。
//    public void push(int x) {
//        A.push(x);
//        if (B.isEmpty()) {
//            B.push(x);
//            return;
//        }
//        int min = B.peek();
//        if (x < min) {
//            min = x;
//        }
//        B.push(min);
//    }
//
//    // 删除栈顶的元素。
//    public Integer pop() {
//        if (A.isEmpty()) {
//            return null;
//        }
//        B.pop();
//        return A.pop();
//    }
//
//    //获取栈顶元素。
//    public Integer top() {
//        if (A.isEmpty()) {
//            return null;
//        }
//        return A.peek();
//    }
//
//    //检索栈中的最小元素。
//    public Integer getMin() {
//        if (A.isEmpty()) {
//            return null;
//        }
//        return B.peek();
//    }
}
