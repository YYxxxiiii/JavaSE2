package java_0732;

class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(int x) {
        data = x;
    }
}

public class RealLinkedList {

    public static void main(String[] args) {
        RealLinkedList realLinkedList = new RealLinkedList();
        realLinkedList.addFirst(1);
        realLinkedList.addFirst(3);
        realLinkedList.addFirst(3);
        realLinkedList.addFirst(4);
        realLinkedList.addFirst(5);
        realLinkedList.addLast(19);

        realLinkedList.addIndex(3,999);

        realLinkedList.remove(999);
        realLinkedList.removeAllKey(3);
        realLinkedList.display();

        realLinkedList.clear();
        System.out.println("aadxsaas");


    }

    public ListNode head;
    public ListNode tail;
    //加了tail时间复杂度变成O(1)

    public void display() {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
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
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }


    //删除第一次出现的k
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = searchIndex(index);
        ListNode node = new ListNode(data);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next = node;
        cur.prev = node;
    }

    private int size() {
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    public ListNode searchIndex(int index) { //找到index下标的结点
        ListNode cur = head;
        while (index > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    public void remove(int k) {
        ListNode cur = head;

        while (cur != null) {
            if (cur.data == k) {
                if (cur == head) {
                    head = head.next;
                    head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删的不是尾节点
                        cur.next.prev = cur.prev;
                    } else {
                        tail = cur.prev;
                    }
                }
                return;
            } else {
                cur = cur.next;
            }
        }
    }

    public void removeAllKey(int key) {
        ListNode cur = head;

        while (cur != null) {
            if (cur.data == key) {
                if (cur == head) {
                    head = head.next;
                    head.prev = null;
                } else {
                    cur.prev.next = cur.next;
                    if (cur.next != null) {
                        //删的不是尾节点
                        cur.next.prev = cur.prev;
                    } else {
                        tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }

    public void clear() {

        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = next;
        }
        head = null;
        tail = null;
    }
}
