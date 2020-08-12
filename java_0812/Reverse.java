package java_0812;

import java.util.Scanner;

public class Reverse {
    public static String reverse(String str, int begin, int end) {
        char[] c = str.toCharArray();
        while (begin < end) {
            char tmp = c[begin];
            c[begin] = c[end];
            c[end] = tmp;
            begin++;
            end--;
        }
        String string = String.copyValueOf(c);
        return string;
    }

    public static String reverseK(String str, int k) {
        if (str == null || str.length() == 0 || k <= 0 || k >= str.length()) {
            return null;
        }
        str = reverse(str, 0, k - 1);
        str = reverse(str, k, str.length() - 1);
        str = reverse(str, 0, str.length() - 1);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc  .nextInt();
        String str = sc.next();
        String ret = reverseK(str, k);
        System.out.println(ret);
    }
}
