package java_00;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[10];
        int[] rScore = new int[10];

        float sum = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            v += score[i];
        }

        for (int i = 0; i < n; i++) {
            rScore[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int grade = rScore[i];

            if (grade >= 90) {
                sum += 4.0 * score[i];
            }
            if (grade >= 85 && grade <= 89) {
                sum += 3.7 * score[i];
            }
            if (grade <= 84 && grade >= 82) {
                sum += 3.3 * score[i];
            }
            if (grade <= 81 && grade >= 78) {
                sum += 3.0 * score[i];
            }
            if (grade <= 77 && grade >= 75) {
                sum += 2.7 * score[i];
            }
            if (grade <= 74 && grade >= 72) {
                sum += 2.3 * score[i];
            }
            if (grade <= 71 && grade >= 68) {
                sum += 2.0 * score[i];
            }
            if (grade <= 67 && grade >= 64) {
                sum += 1.5 * score[i];
            }
            if (grade <= 63 && grade >= 60) {
                sum += 1.0 * score[i];
            }
            if (grade < 60) {
                sum += 0;
            }
        }
        System.out.println(String.format("%.2f", sum / v));
    }
}
