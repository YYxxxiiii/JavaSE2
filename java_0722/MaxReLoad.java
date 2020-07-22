package java_0722;

/**
 * 重载
 * 在同一个类中定义多个方法：
 * 要求不仅可以求两个整数的最大值，
 * 还可以求两个小数的最大值，
 * 以及两个小数和一个整数的大小关系
 */
public class MaxReLoad {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        double c = 3.45;
        double d = 2.78;
        int e = 10;
        System.out.println(findMax(a, b));
        System.out.println(findMax(c, d));
        System.out.println(findMax(c, d, b));
        System.out.println(findSum(c, d));
        System.out.println(findSum(a, b, e));
    }

    public static int findMax(int x1,int x2) {
        return x1 > x2 ? x1 : x2;
    }

    public static double findMax(double x1,double x2) {
        return x1 > x2 ? x1 : x2;
    }

    public static double findMax(double x1,double x2,int x3) {
        return (x1 > x2 ? x1 : x2) > x3 ? (x1 > x2 ? x1 : x2) : x3;
    }
     public static int findSum(int x1,int x2,int x3){
        return x1 + x2 + x3;
     }
     public static double findSum(double x1,double x2) {
        return x1 + x2;
     }
}
