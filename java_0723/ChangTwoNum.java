package java_0723;

/**
 * 两个数交换
 * 地址
 */
public class ChangTwoNum {
    public static void swap(int[] array) {
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {10, 20};
        System.out.println(array[0] + " " + array[1]);
        swap(array);
        System.out.println(array[0] + " " + array[1]);
    }
}
