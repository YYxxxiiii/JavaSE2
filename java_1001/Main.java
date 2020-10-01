package java_1001;

import java.util.Stack;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] left = new int[arr.length];
            int[] right = new int[arr.length];
            Stack stack = new Stack<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++) {
                while (!stack.empty() && arr[i] < arr[(int) stack.peek()]) {
                    int tmp = (int) stack.pop();
                    if(stack.isEmpty()) {
                        left[tmp] = -1;
                    } else {
                        left[tmp] = (int) stack.peek();
                    }
                    right[tmp] = i;
                }
                stack.push(i);
            }
            while (!stack.empty()) {
                int tmp = (int) stack.pop();
                if (stack.isEmpty()) {
                    left[tmp] = -1;
                } else {
                    left[tmp] = (int) stack.peek();
                }
                right[tmp] = -1;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(left[i] + " " + right[i]);
            }
        }
    }
}