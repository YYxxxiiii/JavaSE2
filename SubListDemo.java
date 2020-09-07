package list;

import java.util.ArrayList;
import java.util.List;

public class SubListDemo {
    public static void main(String[] args) {
        // Character 是 char 的包装类
        List<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');
        System.out.println(list);
        List<Character> subList = list.subList(1, 4);
        System.out.println(subList);
        System.out.println(list);
    }
}
