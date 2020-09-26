package java_0926;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = sc.nextInt();
            }
            int x = sc.nextInt();
            int index = -1;
            for (int i = 0; i < num; i++) {
                if (arr[i] == x) {
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
