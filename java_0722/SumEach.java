package java_0722;

import java.util.Scanner;

public class SumEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findSum(n));
    }

    public static int findSum(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + findSum(n / 10);
    }
}
