package java_0731;

/**
 * 21. 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                newTail.next = new ListNode(cur1.val);
                newTail = newTail.next;
                cur1 = cur1.next;
            } else {
                newTail.next = new ListNode(cur2.val);
                newTail = newTail.next;
                cur2 = cur2.next;
            }
        }
        if (cur1 == null) {
            newTail.next = cur2;
        } else {
            newTail.next = cur1;
        }
        return newHead.next;
    }
}
