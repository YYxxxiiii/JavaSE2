package java_0723;

import java.util.Arrays;

import static java_0724.Bubble.bubbleSort2;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 6};
        //bubbleSorted(arr);
        //bubbleSort(arr);
        bubbleSort2(arr);
    }

    public static void bubbleSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 走的趟数
            for (int j = 0; j < arr.length - 1 - i; j++) {  //走的次数  这个地方优化了
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}