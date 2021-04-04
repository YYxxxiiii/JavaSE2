package finger;

public class Twenty_Five {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val > cur2.val) {
                newTail.next = cur2;
                newTail = newTail.next;
                cur2 = cur2.next;
            } else {
                newTail.next = cur1;
                newTail = newTail.next;
                cur1 = cur1.next;
            }
        }
        if (cur1 == null) {
            newTail.next = cur2;
        }
        if (cur2 == null) {
            newTail.next = cur1;
        }
        return newHead.next;
    }
}
