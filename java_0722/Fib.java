package java_0722;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(finFib(n));
    }

    public static int finFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return finFib(n - 1) + finFib(n - 2);
    }
}
