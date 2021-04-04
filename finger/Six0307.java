package finger;

import java.util.Stack;

public class Six0307 {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop().val;
        }
        return print;
    }


//     public int[] reversePrint(ListNode head){
//            //先获取链表长度，创建对应长度数组
//            ListNode currNode = head;
//            int len = 0;
//            while (currNode != null) {
//                len++;
//                currNode = currNode.next;
//            }
//            int[] result = new int[len];
//
//            //再次遍历链表，将值倒序填充至结果数组
//            currNode = head;   //这一步是必要的
//            while (currNode != null) {
//                result[len - 1] = currNode.val;
//                len--;
//                currNode = currNode.next;
//            }
//            return result;
//        }
}
