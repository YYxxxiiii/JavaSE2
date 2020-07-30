package java_0730;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

/**
 * nowcoder
 * 删除链表中重复结点
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，重复的结点不保留，
 * 返回链表头指针。 例如，链表1->2->3->3->4->4->5
 * 处理后为 1->2->5
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead){
        ListNode newHead = new ListNode(-1);
        ListNode newTail = newHead;

        // 循环遍历链表
        ListNode cur = pHead;
        while (cur != null) {
            // 判定 cur 是否是重复元素
            // 时刻牢记, 针对某个引用进行 . 操作的时候, 必须保证该引用不能是 null
            // 假设 cur 已经指向 最后一个元素了, cur.next 就是 null
            // 短路求值. 左侧表达式如果为 false, 右侧就不求值了(对于逻辑与来说)
            if (cur.next != null && cur.val == cur.next.val) {
                // 说明 cur 指向的元素就是重复元素, 接下来就需要找到这个重复元素区间的末尾
                // 最终能够跳过整个重复元素的区间
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                // 上面的 while 循环结束, 此时 cur 就指向这片相同元素区间的最后一个位置
                // 再多走一步就意味着跳过了整个相同元素的区间
                cur = cur.next;
            } else {
                // 说明 cur 指向的元素不是重复元素
                // 把这个元素插入到新链表中
                newTail.next = new ListNode(cur.val);
                newTail = newTail.next;
                cur = cur.next;
            }
        }
        return newHead.next;
    }


    public ListNode deleteDuplication2(ListNode pHead) {
        ListNode newHead = new ListNode(-1);
        ListNode tmp = newHead;
        ListNode cur = pHead;

        while (cur != null) {
            if(cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }else {
                tmp.next = cur; //两个代码的差别在这
                tmp = cur;
                cur = cur.next;
            }
        }
        tmp.next = null; //两个代码的差别在这
        return newHead.next;
    }

}
