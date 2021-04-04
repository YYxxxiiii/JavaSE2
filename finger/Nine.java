package finger;

import java.util.Deque;
import java.util.LinkedList;

class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        //如果第二个栈为空
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */



//class CQueue {
//    LinkedList<Integer> A, B;
//    public CQueue() {
//        A = new LinkedList<Integer>();
//        B = new LinkedList<Integer>();
//    }
//    public void appendTail(int value) {
//        A.addLast(value);
//    }
//    public int deleteHead() {
//        if(!B.isEmpty())
//            return B.removeLast();
//        if(A.isEmpty())
//            return -1;
//        while(!A.isEmpty())
//            B.addLast(A.removeLast());
//        return B.removeLast();
//    }
//}

