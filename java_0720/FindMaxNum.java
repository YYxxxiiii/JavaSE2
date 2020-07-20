package java_0720;

import java.util.Scanner;

public class FindMaxNum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入a的值：");
        int a=sc.nextInt();
        System.out.println("请输入b的值：");
        int b=sc.nextInt();
        int max = max2(a,b);
        System.out.println(max);
        boolean Equals=isEquals(a,b);
        System.out.println(Equals);
    }

    public static int max2(int a,int b){
        return (a>b)?a:b;
    }

    public static boolean isEquals(int a,int b){
        return a==b;
    }

}
