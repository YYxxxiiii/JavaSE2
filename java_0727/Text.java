package java_0727;

public class Text {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(1,2);
        myArrayList.add(2,3);
        myArrayList.add(3,4);
        myArrayList.add(4,6);
        myArrayList.display();
        myArrayList.remove(1);
        myArrayList.display();
        myArrayList.remove(3);
        myArrayList.display();
        myArrayList.remove(6);
        myArrayList.display();
        myArrayList.clear();
    }

}
