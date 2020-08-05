package java_0805;

import java.util.Scanner;

public class JudegNum {
    public static boolean judegNum(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s  = "123c";
//        boolean n = judegNum(s);
//        System.out.println(n);

            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            System.out.println(str.replace(" ",""));

    }


}
