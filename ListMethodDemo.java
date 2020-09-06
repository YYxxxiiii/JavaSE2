package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethodDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("我是");
        list.add("中国人");
        list.add(3, "吃了么");

        System.out.println(list);

        String s = list.get(2);
        System.out.println(s);

        list.set(4, "好的");
        System.out.println(list);

        System.out.println(list.size());

        list.remove("中国人");
        System.out.println(list);
        System.out.println(list.size());

//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());
//        System.out.println(list.size());

        System.out.println(list.contains("中国人"));
        System.out.println(list.contains("我是"));
        System.out.println(list.indexOf("我是"));
        System.out.println(list.lastIndexOf("我是"));
        System.out.println(list.indexOf("中国人"));
    }
}
