package java_0722;

import java.util.Scanner;

public class DNFac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
    }
    public static int fac(int n) {
        if (n == 1) {
            return n;
        }
        return n * fac(n - 1);
    }
}
