package java_1006;

public class Main {
    public static void main(String[] args) {
        int richman = 0;
        int person = 0;
        for (int i = 0; i < 30; i++) {
            richman += 10;
            person += Math.pow(2,i);
        }
        System.out.println(richman + " " + person);
    }
}
