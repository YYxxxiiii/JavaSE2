package java_0718;

import java.util.Scanner;

public class OlderAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 18) {
            System.out.println("少年");
        } else if (n > 19 && n <= 28) {
            System.out.println("青年");
        } else if (n >= 29 && n <= 55) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }
}
