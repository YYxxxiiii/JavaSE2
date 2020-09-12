package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {  // hasNext() 被调用 6 次
                                // 分别返回 true true true true true false
            String next = it.next();    // next() 被调用 5 次
            System.out.println(next);
        }

        // 上述写法，可以被 foreach 写法替代
        // foreach 写法，本质上，其实就是通过迭代器实现的
        // 换言之，凡是支持 Iterable 能力的容器，都可以使用 foreach 写法（了解）
        for (String next : list) {
            System.out.println(next);
        }
    }
}
