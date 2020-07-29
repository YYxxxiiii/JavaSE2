package java_0729;

/**876. 链表的中间结点
 * 返回非空链表的中间结点
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        int step = size(head) / 2;
        ListNode cur = head;
        for (int i = 0; i < step; i++) {
            cur = cur.next;
        }
        return cur;
    }
    public int size(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
}
