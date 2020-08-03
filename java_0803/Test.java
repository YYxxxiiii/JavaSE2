package java_0803;

//public class Test {
//    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.addLast(4);
//        linkedList.addLast(4);
//        linkedList.addLast(5);
//        linkedList.addLast(4);
//        linkedList.addLast(4);
//        linkedList.addLast(4);
//        linkedList.display();
//
//
//        linkedList.removeAllKey(4);
//        linkedList.display();
//    }

//    class Base {
//        Base() {
//            System.out.print("Base");
//        }
//    }
//
//    public class Test extends Base {
//        public static void main( String[] args ) {
//            new Test();
//            //调用父类无参的构造方法
//            new Base();
//        }
//    }

//class Base{
//
//    public Base(String s){
//
//        System.out.print("B");
//
//    }
//
//}
//
//public class Test extends Base{
//
//    public Test (String s) {
//
//        System.out.print("D");
//
//    }
//
//    public static void main(String[] args){
//
//        new Test("C");
//
//    }
//
//}

//class X{
//    Y y=new Y();
//    public X(){
//        System.out.print("X");
//    }
//}
//class Y{
//    public Y(){
//        System.out.print("Y");
//    }
//}
//public class Test extends X{
//    Y y=new Y();
//    public Test(){
//        System.out.print("Test");
//    }
//    public static void main(String[] args) {
//        new Test();
//    }
//}

class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {
        B a = new B();
        B b = new D();
        a.Func();
        b.Func();
    }
}