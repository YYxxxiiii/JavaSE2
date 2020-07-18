package java_0718;

import java.util.Scanner;

public class WaterFlower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个100-999的整数:");
        int n = scanner.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n/ 10 / 10 % 10;
        if (a*a*a + b*b*b + c*c*c == n) {
            System.out.println("是水仙花数");
        } else {
            System.out.println("不是水仙花数");
        }
    }
}
