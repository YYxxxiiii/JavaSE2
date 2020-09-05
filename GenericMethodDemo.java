package generic;

public class GenericMethodDemo {
    public static <T> void bubbleSort(T[] array) {
    }

    public static void main(String[] args) {
        {
            Teacher[] teachers = new Teacher[10];

            // 完整写法：传入 Teacher，表示方法定义时 T 就是 Teacher 类型
            GenericMethodDemo.<Teacher>bubbleSort(teachers);

            // 编译器有能力算出来，这里 T 就是 Teacher 类型
            GenericMethodDemo.bubbleSort(teachers);

            // 因为在本类中调用，所以类名也可以省略
            bubbleSort(teachers);
        }

        {
            Student[] students = new Student[10];

            bubbleSort(students);
        }
    }
}
