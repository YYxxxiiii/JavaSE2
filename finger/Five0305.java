package finger;

public class Five0305 {
    public String replaceSpace(String s) {
        //就是考一个string的不可变性，找个StringBuffer或者StringBulider来拼接。
        //StringBuffer为sychronized修饰线程安全。StringBuilder为线程不安全类。
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                sb.append("%20");
            } else {
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }

//    public String replaceSpace(String s) {
//        int length = s.length();
//        char[] arr = new char[length * 3];
//        int size = 0;
//        for (int i = 0; i < length; i++) {
//            char c = s.charAt(i);
//            if (c == ' ') {
//                arr[size++] = '%';
//                arr[size++] = '2';
//                arr[size++] = '0';
//            } else {
//                arr[size++] = c;
//            }
//        }
//        String newStr = new String(arr,0,size);
//        return newStr;
//    }
}
