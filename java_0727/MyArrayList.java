package java_0727;

import java.util.Arrays;

public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public MyArrayList() {
        this.elem = new int[5];
        this.usedSize = 0;
    }


    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //在pos位置新增元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > this.usedSize) {
            return;
        }
        if (this.usedSize == this.elem.length) {
            this.elem = Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    //判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //查找某个元素对应位置
    public int search(int toFind) {
        for (int i = 0; i < this.elem.length; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }


    //获取pos位置的元素
    public int getPos(int pos) {
        if (pos < 0 || pos >= this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }

    //给pos位置的元素设为value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize) {
            return;
        }
        this.elem[pos] = value;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos = search(toRemove);
        if (pos == -1) {
            return;
        }
        if (pos == this.usedSize - 1) {
            this.usedSize--;
            return;
        }
        for (int i = pos; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }

    //清空顺序表
    //如果链表里面是引用类型,要记得置空 =null
    public void clear() {
        this.usedSize = 0;
    }

}