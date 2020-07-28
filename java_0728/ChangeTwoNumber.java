package java_0728;

class Change {
    public int val;

}
public class ChangeTwoNumber {
    public static void main(String[] args) {
        Change x1 = new Change();
        x1.val=10;
        Change x2 = new Change();
        x2.val = 20;
        fun(x1,x2);
        System.out.println(x1.val + " " + x2.val);
    }
    public static void fun(Change a, Change b) {
        int tmp = a.val;
        a.val = b.val;
        b.val = tmp;
    }
}
