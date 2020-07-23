package java_0723;

public class RealizeToString {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String ret = myString(arr);
        String ret2 = myString(arr);
        System.out.println(ret);
        System.out.println(ret2);

    }

    /**
     * 这个效率比较低
     * 每执行一次都会创建一个String对象
     * @param arr
     * @return
     */
    public static String myString(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        }
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length - 1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }

    public static String myString2(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return "[]";
        }
        StringBuilder sd = new StringBuilder();
        sd.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sd.append(arr[i]);
            } else {
                sd.append(arr[i]).append(",");
            }
        }
        sd.append("]");
        return sd.toString();
    }
}
