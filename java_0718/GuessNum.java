package java_0718;

import java.util.Random;
import java.util.Scanner;

public class GuessNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random rd = new Random();
        int random = rd.nextInt(100) + 1;

        while(true) {
            System.out.println("请输入你要猜的数字:");
            int n = sc.nextInt();
            if (n < random) {
                System.out.println("猜小了");
            } else if (n == random) {
                System.out.println("猜对了");
            } else {
                System.out.println("猜大了");
            }
        }
    }
}
