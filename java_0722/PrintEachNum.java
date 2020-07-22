package java_0722;

import java.util.Scanner;

public class PrintEachNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10 + " ");
    }
}
