package java_1005;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            double x0 = sc.nextInt();
            double y0 = sc.nextInt();
            double z0 = sc.nextInt();
            double x1 = sc.nextInt();
            double y1 = sc.nextInt();
            double z1 = sc.nextInt();
            double tmp = Math.pow((x1 - x0), 2) + Math.pow((y1 - y0), 2) + Math.pow((z1 - z0), 2);
            double r = Math.sqrt(tmp);
            double v = (4 / 3.0) * Math.acos(-1.0) * Math.pow(r, 3);
            System.out.printf("%.3f",r);
            System.out.printf(" %.3f", v);
        }
    }
}