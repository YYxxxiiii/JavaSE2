package java_0730;

/**
 * 链表中倒数第k个结点
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head,int k) {
        int size = size(head);
        if (head == null) {
            return null;
        }
        if (k <= 0 || k > size) {
            return null;
        }
        int steps = size - k;
        ListNode cur = head;
        for (int i = 0; i < steps; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
}
