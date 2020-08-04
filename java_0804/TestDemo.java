package java_0804;

class Cycle implements IShape {

    @Override
    public void draw() {
        System.out.println("○");
    }
}
public class TestDemo {
    public static void main(String[] args) {
        IShape shape = new Cycle();
        shape.draw();
        shape.func();
        System.out.println(IShape.COUNT);
    }
}
