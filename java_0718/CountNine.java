package java_0718;

public class CountNine {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i / 10 == 9) { //这里
                count++;
            }
            if (i % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }
}
