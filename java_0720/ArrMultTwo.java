package java_0720;

import java.util.Arrays;

public class ArrMultTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString((transform(arr))));

    }
    public static int[] transform(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i] * 2;
        }
        return arr;
    }
}
