package finger;

public class Twenty_Two {
    public ListNode getKthFromEnd(ListNode head, int k) {
        int size = size(head);
        int step = size - k;
        ListNode cur = head;
        for (int i = 0; i < step; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public static int size (ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
}
