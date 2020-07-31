package java_0731;


/*
160. 相交链表
相交链表的第一个公共点 ,也就是相交点
        编写一个程序，找到两个单链表相交的起始节点。
        如下面的两个链表：
        在节点 c1 开始相交。

        示例 1：
        输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
        输出：Reference of the node with value = 8
        输入解释：相交节点的值为 8 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。

        示例 2：
        输入：intersectVal = 2, listA = [0,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
        输出：Reference of the node with value = 2
        输入解释：相交节点的值为 2 （注意，如果两个链表相交则不能为 0）。从各自的表头开始算起，链表 A 为 [0,9,1,2,4]，链表 B 为 [3,2,4]。在 A 中，相交节点前有 3 个节点；在 B 中，相交节点前有 1 个节点。
*/

/**
 * 得到两个链表的长度
 * 长的那个走两链表相差的步数
 * 比较两个链表的地址
 * 第一个相同地址的结点
 * 就是第一个相交结点
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int size1 = size(headA);
        int size2 = size(headB);

        if (size1 > size2) {
            int offset = size1 - size2;
            for (int i = 0; i < offset; i++) {
                headA = headA.next;
            }
        } else {
            int offset = size2 - size1;
            for (int i = 0; i < offset; i++) {
                headB = headB.next;
            }
        }
        while (headA != null && headB != null) {
            if (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            } else {
                return headA;
            }
        }
        return null;
    }
    public int size(ListNode head) {
        int size = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }
}
