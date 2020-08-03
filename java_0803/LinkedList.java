package java_0803;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    public ListNode(int x) {
        val = x;
    }
}
public class LinkedList {
    public ListNode tail;
    public ListNode head;

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }

    public void addLast(int data) {
        ListNode cur = new ListNode(data);
        if (head == null) {
            addFirst(data);
        } else {
            tail.next = cur;
            cur.prev = tail;
            tail = cur;
        }
    }

    public void addIndex(int index, int data) {
        int size = size(head);
        if (index < 0 || index > size) {
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
        node.next = cur;
    }

    private ListNode searchIndex(int index) {
        ListNode cur = head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    private int size(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        return size;
    }

    public void remove(int key) {
        if (head == null) {
            return;
        }
        if (head.val == key) {
            head.next.prev = null;
            head.next = head;
        }
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                cur.prev.next = cur.next;
                if (cur != tail) {
                    cur.next.prev = cur.prev;
                } else {
                    tail = cur.prev;
                }
                return;
            }
            cur = cur.next;
        }

    }

    public void removeAllKey(int key) {
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                if (cur == head) {
                    head = head.next;
                    head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        cur.next.prev = cur.prev;
                    } else {
                        tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
}
