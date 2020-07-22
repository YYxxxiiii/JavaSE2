package java_0722;

public class DSum {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }
}
