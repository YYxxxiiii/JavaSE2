package java_0720;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibNum(num));

    }
    public static int fibNum(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return  fibNum(n-1) + fibNum(n - 2);
        }
    }
}
