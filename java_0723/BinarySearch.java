package java_0723;


//可以直接写 Arrays.binarySearch()
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6}; //一定要是个有序数组
        //如果不是一个有序的 就加: Arrays.sort(arr);
        System.out.println(binarySearch(arr, 4));
    }
    public static int binarySearch(int[] arr,int key) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = (left + right) / 2; //(left+right)>>>1
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > key) {
                    right = mid - 1;
                } else if (arr[i] < key) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
