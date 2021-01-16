package AZ_0116;

import java.util.Stack;


/**
 * offer 插入
 * poll 删除
 * peek 看但不删除
 */
//2.两个栈组成的队列
public class TwoTwoStackQueue {
    public Stack<Integer> stackPush = new Stack<>();
    public Stack<Integer> stackPop = new Stack<>();

    public void offer(int pushInt) {
        stackPush.push(pushInt);
    }

    public int poll() {
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public int peek() {
        //pop那个不为空的时候就能看他,要是为空了,就如下两种处理方式
        if (stackPop.empty() && stackPush.empty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stackPop.empty()) {
            while (!stackPush.empty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
