package java_0718;

public class MQue {
    public static void main(String[] args) {
        double sum = 0;
        double tmp = 1;
        int flag = 1;
        for (int i = 1; i <= 100; i++)
        {
            tmp = flag * 1.0 / i;
            flag = -1;
            sum += tmp;
        }
        System.out.println(sum);
    }
}
