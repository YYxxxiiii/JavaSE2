package java_1003;

import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            BigInteger[] arr = new BigInteger[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextBigInteger();
            }
            Arrays.sort(arr);
            for (int i = 0; i < a; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}