package finger;

public class Ten2 {
    //动态规划 时间复杂度和空间复杂度都为O(n)
    public int numWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i -1] + dp[i -2]) % 1000000007;
        }
        return dp[n];
    }


    //动态规划 空间复杂度为0(1)
    public int numWays2(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fn1 = 1;
        int fn2 = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = (fn1 + fn2) % 1000000007;
            fn1 = fn2;
            fn2 = tmp;
        }
        return fn2;
    }
}
