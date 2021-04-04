package finger;

public class Twenty_Four {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode newHead = new ListNode(-1);
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            if (cur.next == null) {
                newHead = cur;
            }
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return newHead;
    }
}
