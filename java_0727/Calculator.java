package java_0727;

/*编写一个Calculator类,完成两个数的加减乘除*/
public class Calculator {
    private int num1;
    private int num2;

    //用构造方法和set方法任意一种都可以
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }

    public double dev() {
        return this.num1 * 1.0 / this.num2;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator(20,60);

        System.out.println(calculator.add());
        System.out.println(calculator.sub());
        System.out.println(calculator.mul());
        System.out.println(calculator.dev());
    }
}
