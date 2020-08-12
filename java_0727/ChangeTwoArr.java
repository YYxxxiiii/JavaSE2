package java_0727;

import java.util.Arrays;

public class ChangeTwoArr {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        swap(a,b);
    }

    public static void swap(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            int tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

