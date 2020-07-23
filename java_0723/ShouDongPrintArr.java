package java_0723;

import java.util.Arrays;
import java.util.Scanner;

public class ShouDongPrintArr {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
}
