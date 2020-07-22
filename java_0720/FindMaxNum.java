package java_0720;


public class FindMaxNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 8;
        System.out.println(max3(a,b,c));
    }

    public static int max2(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int max3(int a,int b,int c){
        int maxTwo = max2(a,b);
        int max = max2(c,maxTwo);
        return max;
    }

}
