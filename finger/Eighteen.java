package finger;
 class ListNode{
     int val;
     ListNode next;

     public ListNode(int x) {
         val = x;
     }
 }
public class Eighteen {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        while(cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}
