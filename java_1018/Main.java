package java_1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = 0;
        if (x >= 1 && x <= 180) {
            y = 5*x;
        }
        System.out.println(y);
    }
}
