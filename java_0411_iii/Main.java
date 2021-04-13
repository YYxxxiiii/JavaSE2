package java_0411_iii;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String a = sc.next();
            char[] arr = a.toCharArray();
            func(n, arr);
        }
    }
    private static int func(int n, char[] arr) {
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer tmp = hashMap.get(arr[i]);
            if (tmp == null) {
                hashMap.put(arr[i],1);
                tmp = 1;
            } else {
                hashMap.put(arr[i] , tmp + 1);
            }
            if(tmp +1 > arr.length / 2) {
                return ((1 + n) * n) / 2 -1;
            }
        }
        return -1;
    }
}
