package java_0804;

public interface IShape {
    int COUNT = 10;
    void draw();

    default void func() {
        System.out.println("sdad");
    }
}
