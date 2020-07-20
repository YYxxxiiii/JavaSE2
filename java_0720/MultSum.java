package java_0720;

import java.util.Scanner;

public class MultSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ret = 1;
        int sum = 0;
        int i = 1;
        for (; i <= n; i++) {
            ret *= i;
            sum += ret;
        }

        System.out.println(sum);
    }
}
