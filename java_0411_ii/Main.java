package java_0411_ii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            String num = sc.next();
            int[] arr = new int[num.length()];
            int zNum = 0;
            int oNum = 0;
            for (int i = 0; i < num.length(); i++) {
                arr[i] = Integer.parseInt(num.substring(i, i+1));
            }
            for (int i = 0; i < num.length(); i++) {
                if (arr[i] == 0) {
                    zNum++;
                }
                if (arr[i] == 1) {
                    oNum++;
                }
            }
            int ret = Math.abs(zNum - oNum);
            System.out.println(ret);
        }

    }
}
