package java_0730;



/*
nowcoder
链表的回文结构
对于一个链表，请设计一个时间复杂度为O(n),
额外空间复杂度为O(1)的算法，判断其是否为回文结构。

   给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
    测试样例：
    1->2->2->1
    返回：true
*/


public class ChkPalindrome {
    public boolean chkPalindrome(ListNode A) {
        int size = size(A);
        int step = size / 2;
        ListNode B = A;

        //1.找到A的中间结点
        for (int i = 0; i < step; i++) {
            B = B.next;
        }

        //2.从B开始对后面的链表进行逆置
        ListNode prev = null;
        ListNode cur = B;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) { //到了链尾,更新头节点的位置
                B = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        while (B != null) {
            if (A.val != B.val) {
                return false;
            }
            A = A.next;
            B = B.next;
        }
        return true;
    }
    public int size(ListNode A) {
        int size = 0;
        ListNode cur = A;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }
}
