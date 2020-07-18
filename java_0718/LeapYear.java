package java_0718;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int n = sc.nextInt();
        isLeapYear(n);
        if(isLeapYear(n) == 1) {
            System.out.println(n + "是闰年");
        } else {
            System.out.println(n + "不是闰年");
        }
    }

    public static int isLeapYear(int x) {
        if (x % 4 == 0 && x % 100 != 0 || x % 400 == 0) {
            return 1;
        }
        return 0;
    }
}
