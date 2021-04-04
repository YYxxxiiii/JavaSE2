package finger;

public class Ten1 {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            arr[i] %= 1000000007;
        }
        return arr[n];
    }


    public int fib2(int n) {
        if (n == 0) {
            return 0;
        }
        int fn0 = 0;
        int fn1 = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = fn0 + fn1;
            fn0 = fn1;
            fn1 = tmp % 1000000007;  //每次运算都取模,避免越界
        }
        return fn1;
    }
}
