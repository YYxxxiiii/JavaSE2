package java_0731;

/*142. 环形链表 II

        给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
        为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
        说明：不允许修改给定的链表。


        示例 1：
        输入：head = [3,2,0,-4], pos = 1
        输出：tail connects to node index 1
        解释：链表中有一个环，其尾部连接到第二个节点。

        示例 2：
        输入：head = [1,2], pos = 0
        输出：tail connects to node index 0
        解释：链表中有一个环，其尾部连接到第一个节点。*/

/**
 *  1. 先用快慢指针找到两指针的交点
 *  2.头节点和交点分别作为起始点
 *  3.各走一步,重合的点便是连接的那个结点
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        // 使用快慢指针, 找到快慢指针的交点
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            //不带环
            return null;
        }
        //带环的情况下
        //一个为头节点,,一个为刚刚找到的点
        ListNode cur1 = head;
        ListNode cur2 = fast;
        while (cur1 != cur2) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }
}
