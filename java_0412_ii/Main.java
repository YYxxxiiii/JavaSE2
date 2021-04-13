package java_0412_ii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func2(n));
    }

    private static int[][] func2(int n) {
        int k = (int)Math.pow(n, 2);
        int q = (int)Math.pow((n -1), 2);
        int[][] arr = new int[k][k];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < q; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = q; i < k; i++) {
            for (int j = 0; j < q; j++) {
                if (i == (k - 1) || j == (q - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < q; i++) {
            for (int j = q; j < k; j++) {
                if (i == (q - 1) || j == (k - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = q; i < k; i++) {
            for (int j = q; j < k; j++) {
                if (i == (k - 1) || j == (k - 1)) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}
