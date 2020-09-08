package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        // 这种写法会抛异常
        /*
        for (String next : list) {
            if (next.equals("C")) {
                list.remove("C");
            }
        }
        */

        // 这个是正确的写法，使用迭代器删除当前迭代到的元素
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.equals("C")) {
                it.remove();    // 删除当前迭代到的元素
            }
        }

        System.out.println(list);   // 期望打印：A B D E
    }
}
