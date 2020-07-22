package java_0722;


public class AvgNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(avg(arr));
    }
    public static int avg(int[] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret += i;
        }
        return ret / arr.length;
    }
}
