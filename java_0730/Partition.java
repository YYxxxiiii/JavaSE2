package java_0730;


public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;
        while (cur != null) {
            if (x <= cur.val) {
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            } else {
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            }
            cur = cur.next;
        }
        smallTail.next = bigHead.next;
        return smallHead.next;
    }

    public ListNode partition2(ListNode pHead, int x) {
        ListNode bigHead = new ListNode(-1);
        ListNode bigTail = bigHead;
        ListNode smallHead = new ListNode(-1);
        ListNode smallTail = smallHead;

        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        for (ListNode cur = pHead; cur != null; cur = cur.next) {  //两个代码的区别就在 一个用的while  一个用的for
            if (x <= cur.val) {
                bigTail.next = new ListNode(cur.val);
                bigTail = bigTail.next;
            } else {
                smallTail.next = new ListNode(cur.val);
                smallTail = smallTail.next;
            }
        }
        smallTail.next = bigHead.next;
        return smallHead.next;
    }
}
