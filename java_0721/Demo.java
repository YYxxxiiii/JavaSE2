package java_0721;

/**
 * 方法重载
 */
public class Demo {
    public static double add(double a,int b) {
        return a+b;
    }
    public static double add(int a,double b) {
        return a+b;
    }
    public static int add(int a,int b) {
        return a-b;
    }
}
