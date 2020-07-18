package java_0718;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int ret = 1;
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            ret *= i;
//            sum += ret;
//        }
//        System.out.println(sum);
        int num = 1;
        int sum = 0;
        while (num <= 5) {
            int ret = 1;
            int i = 1;
            while(i <= num) {
                ret *= i;
                i++;
            }
            sum += ret;
            num++;
        }
        System.out.println(sum);
    }
}
