package java_0718;

import java.util.Scanner;

public class JudgePrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);
        if (isPrime(n) == 1) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
    public static int isPrime(int x) {
        for (int i = 2; i < x - 1; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
