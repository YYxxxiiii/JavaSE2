package java_0806;

public class StringB {
    public static int testFinally() {
        int a = 10;
        try {
            return 4;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            return a;
        }
    }

    public static void main(String[] args) {
        System.out.println(testFinally());
    }
}
