package java_0725;

 public class Demo {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        Demo hsl = new Demo();// 4
        hsl.x++;// 5
        Demo hs2 = new Demo();// 6
        hs2.x++;// 7
        hsl = new Demo();// 8
        hsl.x++;// 9
        Demo.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}
