package java_0723;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArr {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ret = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(ret));
    }
}
