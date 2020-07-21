package java_0721;

import java.util.Scanner;

public class DPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //fuc(n);
        //System.out.println(sum(n));
        System.out.println(plusEach(n));
    }

    /**
     * 输入1234
     * 打印: 1 2 3 4
     * 按位打印
     * @param n
     */
    public static void fuc(int n) {
        if (n > 9) {
            fuc(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    /**
     * 递归求1+2+...+n
     * @param n
     * @return
     */
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else if (n > 1){
            return n + sum(n - 1);
        } else {
            return -1;
        }
    }

    /**
     * 写一个递归方法,输入一个非负整数,返回组成它的数字之和.
     * 例如:输入1729,则返回1+7+2+9
     * 和为19
     * @param n
     * @return
     */
    public static int  plusEach(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + plusEach(n / 10);
    }
}
