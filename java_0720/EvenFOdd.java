package java_0720;

import java.util.Arrays;
import java.util.Scanner;

public class EvenFOdd {
    public static void main(String[] args) {
        System.out.println("请输入一组数字,用逗号隔开:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        String arr[] = str.split(",");
        int[] b = new int[arr.length];

        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(arr[i]);
        }
        frontOdd(b);
    }

    public static  void frontOdd(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while ((left < right) && (arr[left] % 2 == 1)) {
                left++;//是奇数时，数组向右继续
            }
            while ((left < right) && (arr[right] % 2 == 0)) {
                right--;//是偶数时，数组向左继续
            }
            if (left < right) {
                int tmp = arr[left];//当奇数在右边，偶数在左边，完成交换
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
