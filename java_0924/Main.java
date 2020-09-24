package java_0924;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            System.out.println(plus(a) + " " + fx(a));
        }
    }

    public static int plus(int x) {
        if (x < 10) {
            return x;
        }
        return (x % 10) + plus(x / 10);
    }

    public static int fx(int x) {
        int n = (int) Math.pow(x, 2);
        return plus(n);
    }
}
