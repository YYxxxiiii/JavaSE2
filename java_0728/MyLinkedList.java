package java_0728;

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class MyLinkedList {
    public Node head;//标识单链表的头节点

    public void display() {
//        for (Node cur = head; cur != null; cur = cur.next) {
//            System.out.print(cur.data + " ");
//        }
//        System.out.println();
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    /**
     * 头插
     *
     * @param data
     */
    public void addFirst(int data) {
        Node node = new Node(data);//node是个引用,保存data的地址if (this.head == null) {

        if (this.head == null) {
            this.head = node;
            return;
        }

        node.next = this.head;
        this.head = node;
    }


    /**
     * 尾插
     *
     * @param data
     */
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node tail = this.head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = node;
            node.next = null;
        }
    }

    /**
     * 任意位置插入,第一个数据节点为0号下标
     */
    public void addIndex(int index, int data) {
        if (index < 0 || index > getLength()) {
            System.out.println("下标不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == getLength()) {
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node prev = searchPrev(index);
        node.next = prev.next;
        prev.next = node;
    }

    /**
     * 查找index - 1的位置,找到返回引用
     *
     * @param index
     * @return
     */
    private Node searchPrev(int index) {
        Node cur = this.head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    /**
     * 获取长度
     *
     * @return
     */
    private int getLength() {
        int size = 0;
        for (Node cur = this.head; cur != null; cur = cur.next) {
            size++;
        }
        return size;
    }

    /**
     * 删除第一次出现的关键字key的节点
     *
     * @param key
     */
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrevNode(key);
        if (prev == null) {
            return;
        }
        Node toDelete = prev.next; //要删除的节点
        prev.next = toDelete.next;
    }

    /**
     * 找key的前驱节点
     *
     * @param key
     * @return
     */
    public Node searchPrevNode(int key) {
//        for (Node cur = head; cur != null
//                && cur.next != null;cur = cur.next) {
//            if (cur.next.data == key) {
//                return cur;
//            }
//        }
//        return null;
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.data == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    /**
     * 查找是否包含关键字key是否在单链表中
     *
     * @param key
     * @return
     */
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) { //注意此处的条件傲
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 移除链表元素
     *要求只遍历一次链表
     * 定义prev指向第一个节点
     * cur为第二个
     * prev为cur的前去节点,
     * 如果cur.data == key,只移动cur
     * 如果cur不是要删除的节点,prev和cur都移动
     * @param key
     */
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;

        while (cur != null) {
            if (cur.data == key) { //只移动cur
                prev.next = cur.next;
                cur = cur.next;
            } else {  //cur和prev都要移动
                prev = cur;
                cur = cur.next;
            }
        }
        //上面一直要删的都是cur,如果是prev也是待删除节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    public void clear() {
        this.head = null;
    }

}
