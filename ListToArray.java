package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        /*
        Object[] objects = list.toArray();
        for (Object o : objects) {
            String s = (String)o;
            // toLowerCase 转小写
            System.out.println(s.toLowerCase());
        }
        String[] sArray = new String[0];
        String[] strings = list.toArray();
        System.out.println(strings == sArray);

        // 数组容量 < list.size()
        String[] sArray = new String[1];
        sArray[0] = "hello";
        String[] strings = list.toArray(sArray);
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
        */

        // 数组容量 == list.size()
        /*
        String[] sArray = new String[5];
        String[] strings = list.toArray(sArray);
        // 打印数组，需要使用 Arrays.toString
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
        // sArray 和 strings 指向同一个对象
        System.out.println(sArray == strings);
        */

        String[] sArray = { "1", "2", "3", "4", "5", "6", "7", "8" };
        String[] strings = list.toArray(sArray);
        System.out.println(strings == sArray);  // 返回 true
        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(sArray));
    }
}
