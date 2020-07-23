package java_0723;

public class ArrMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxNum(arr));
        System.out.println(avgNum(arr));
    }
    public static int maxNum(int[] arr) {
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m){
                m = arr[i];
            }
        }
        return m;
    }

    public static double avgNum(int[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg /= arr.length;
        return avg;
    }
}
