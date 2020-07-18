package java_0718;

import java.util.Scanner;

public class BigDivisor {
    public static int Divisor(int a, int b) {
        if(a >= b) {//辗转相除法
            while(a%b != 0) {
                int c = a%b;
                a = b;
                b = c;
            }
            return b;
        }else {
            while(b%a != 0) {
                int c = b%a;
                b = a;
                a = c;
            }
            return a;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int Big = Divisor(a,b);
        System.out.println("最大公约数为：" + Big);
    }
}
