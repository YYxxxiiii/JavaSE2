package java_0718;

import java.util.Scanner;

public class IsEqual {

    public static void main(String[] args) {
        char ch = 'g';
        char ch2 = 103;
        deng(ch,ch2);
    }
    public static void deng(char x,char x2) {
        if (x == x2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
}
