package java_0411;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nNum = new int[n];
        for (int i = 0; i < n; i++) {
            nNum[i] = sc.nextInt();
        }
        int[] mNum = new int[m];
        for (int i = 0; i < m; i++) {
            mNum[i] = sc.nextInt();
        }
        System.out.println(func(n, m, nNum, mNum));
    }

    public static int func(int n, int m, int[] nNum, int[] mNum) {
        if ((n != nNum.length) || (m != mNum.length)) {
            return -1;
        }
        if (n > m) {
            return -1;
        }
        Arrays.sort(nNum);
        int d = 0;
        for (int i = 0; i < n; i++) {
            d = nNum[i];
        }
        int nScore = n;
        int mScore = 0;
        Arrays.sort(mNum);
        for (int i = 0; i < m; i++) {
            if (mNum[i] > d) {
                mScore += 2;
            } else {
                mScore += 1;
            }
        }
        return mScore - nScore;
    }
}
