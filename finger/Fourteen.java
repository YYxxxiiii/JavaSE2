package finger;

public class Fourteen {
    public int cuttingRope(int n) {
        if (n == 1 ||n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int sum = 1;
        while (n > 4) {
            sum *= 3;
            n -= 3;
        }
        return sum * n;
    }


    public int cuttingRope2(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j,dp[j]) * (i - j));
            }
        }
        return dp[n];
    }
}
