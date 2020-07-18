package java_0718;

public class AddNum {
    public static void main(String[] args) {
        int i = 1;
        int ret = 0;
        int ret2 = 0;
        int ret3 = 0;
        while (i <= 100) {
            if(i % 2 != 0) {
                ret += i;
            } else {
                ret2 += i;
            }
            i++;
        }
        ret3 = ret + ret2;
        System.out.println("1-100奇数的和:" + ret);
        System.out.println("1-100偶数的和:" + ret2);
        System.out.println("1-100的和:" + ret3);
    }
}
