package java_0412;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String a = sc.next();
            int k = sc.nextInt();
            System.out.println(minF(a , k));
        }
    }

    public static int minF(String a, int k) {
        if (k == 0) {
            return -1;
        }
        int[][] dp = new int[a.length()][a.length()];
        for (int i = 0; i < a.length(); i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        return func(a.toCharArray(), 0, (a.length() - 1) / k, dp);
    }

    private static int func(char[] arr, int left, int right, int[][] dp) {
        if (left >= right) {
            return 0;
        }
        if (dp[left][right] != Integer.MAX_VALUE) {
            return dp[left][right];
        }
        if(arr[left] == arr[right]) {
            return dp[left][right] = func(arr, left + 1, right - 1, dp);
        }
        return dp[left][right] = Math.min(func(arr,left + 1, right, dp),func(arr,left, right -1, dp));
    }

}
