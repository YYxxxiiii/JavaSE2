package java_0722;

import java.util.Arrays;

public class ArrHun {
    public static void main(String[] args) {
        int[] arr =new int[100];
        for (int i = 0; i < 100 ; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
