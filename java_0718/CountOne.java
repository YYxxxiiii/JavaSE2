package java_0718;

import java.util.Scanner;

public class CountOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = scanner.nextInt();
        int count = 0;
        for(int i = 0;i < 32;i++) {
            if(((num >> i) & 1) == 1) { //二进制的最后一位
                count++;
            }
        }
        System.out.println(count);
    }
}
