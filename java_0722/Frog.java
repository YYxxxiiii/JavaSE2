package java_0722;

import java.util.Scanner;

/**
 * 青蛙跳台阶
 * 变相的斐波那契
 */
public class Frog {

    /**
     *
     * @param n 台阶数
     * @return
     */
    public static int f(int n) {
        if (n != 1) {
            if (n != 2) {
                return f(n - 1) + f(n - 2);
            } else {
                return 2;
            }
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入台阶数：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("跳法总数：" + "\n" + fJump(n));
    }

    /**
     * 递归版
     * @param n
     * @return
     */
    public static int jumpFlor(int n){
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return jumpFlor(n-1) + jumpFlor(n - 2);
    }

    /**
     * 非递归版青蛙跳台阶
     * 这个效率高
     * @param n
     * @return
     */
    public static int fJump(int n) {
        if (n <= 0) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
