package java_0729;

/**nowcoder
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        int size = size(head);
        if (head == null) {
            return null;
        }
        if (k <= 0 || k > size) {
            return null;
        }
        int step = size - k;
        ListNode cur = head;
        for (int i = 0; i < step; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
}
