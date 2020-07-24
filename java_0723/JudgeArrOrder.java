package java_0723;

import java.util.Scanner;

public class JudgeArrOrder {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if (judgeOrder(arr)) {
            System.out.println("有序");
        } else {
            System.out.println("无序");
        }
    }

    public static boolean judgeOrder(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
