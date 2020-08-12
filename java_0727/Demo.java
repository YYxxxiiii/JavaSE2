package java_0727;

class Value {
    public int val;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class Demo {
    public static void main(String[] args) {
        Value value = new Value();
        value.setVal(10);
        Value value2 = new Value();
        value2.setVal(20);
        func(value,value2);
        System.out.println(value.getVal() + "....." + value2.getVal());
    }

    public static void func(Value a, Value b) {
        int tmp = a.getVal();
        a.setVal(b.getVal());
        b.setVal(tmp);
    }
}
