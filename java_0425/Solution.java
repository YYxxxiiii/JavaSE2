package java_0425;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> hs = new HashSet<String>();
        while (scan.hasNext()) {
            hs.add(scan.next());
        }
        int num = hs.size();
        System.out.println(num);
    }
}

//public class Main {
//    public static int Fib(int num) {
//        if (num == 1 || num == 2) {
//            return  1;
//        } else {
//            return Fib(num -1) + Fib(num - 2);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        int f1 = 0;
//        int f2 = 1;
//        int f3 = f1 + f2;
//        while(true) {
//            if (f2 == num) {
//                System.out.println(0);
//            }
//        }
//  }
//}