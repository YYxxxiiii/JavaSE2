package java_0718;

import java.util.Scanner;

public class EachPartNum {

    public static void print (int n){

        if (n < 0) {//当输入一个负数时，先把它变成整数。
            System.out.println("-");
            n = -n;
        }
        if (n > 9) {
            print(n / 10);
        }
        System.out.println(n % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

}
