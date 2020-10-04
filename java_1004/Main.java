package java_1004;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output = sc.nextLine();
        String realput = sc.nextLine();
        func(output, realput);
    }
    public static void func(String output, String realput) {
        output = output.toUpperCase();
        realput = realput.toUpperCase();
        Set<Character> broken = new HashSet<>();
        char[] c = output.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < realput.length(); i++) {
            list.add(realput.charAt(i));
        }
        for (int i = 0; i < c.length; i++) {
            if(!list.contains(c[i]) && !broken.contains(c[i])) {
                System.out.print(c[i]);
                broken.add(c[i]);
            }
        }
    }
}