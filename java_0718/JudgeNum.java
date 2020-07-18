package java_0718;

import java.util.Scanner;

public class JudgeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println(num + "是负数");
        } else if (num > 0) {
            System.out.println(num + "是正数");
        } else {
            System.out.println(num + "不是正数也不是负数");
        }
    }
}
