package java_0718;

import java.util.Scanner;

public class PassWordM {
    public static void main(String[] args) {
        String str = "123456";
        for(int i = 0;i < 3;i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入密码:");
            String n = sc.next();
            if(n.equals(str)) {
                System.out.println("登陆成功");
                break;
            } else {
                System.out.println("登陆失败");
            }
        }
    }
}
