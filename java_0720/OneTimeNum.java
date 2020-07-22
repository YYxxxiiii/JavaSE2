package java_0720;

import java.util.Scanner;

public class OneTimeNum {
//    public static void main2(String[] args) {
//        System.out.println("请输入一组数据,用逗号隔开:");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine().toString();
//        String arr[] = str.split(",");
//        int[] b = new int[arr.length];
//
//        for (int i = 0; i < b.length; i++) {
//            b[i] = Integer.parseInt(arr[i]);
//        }
//
//        int count = 0;
//        for (int i = 0; i < b.length ; i++) {
//            count = 0;
//            for (int j = 0; j < b.length ; j++) {
//                if (b[i] == b[j])
//                    count++;
//            }
//            if (count == 1) {
//                System.out.println(b[i]);
//            }
//        }
//    }
    public static int findOnce(int[] arr) {
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,3,1};
        System.out.println(findOnce(arr));
    }
}

