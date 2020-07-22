package java_0722;

import java.util.Scanner;

public class HanniTower {

    public static void move(char pos1,char pos2) {
        System.out.print(pos1 + "->" + pos2 + " ");
    }

    /**
     *
     * @param n 盘子数
     * @param pos1 起始位置
     * @param pos2 中途位置
     * @param pos3 终点
     */
    public static void hT(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        } else {
            hT(n - 1,pos1,pos3,pos2);
            move(pos1,pos3);
            hT(n-1,pos2,pos1,pos3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hT(n,'A','B','C');
    }
}
