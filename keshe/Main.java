package keshe;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

//哈夫曼编码
public class Main {

    /**
     * @param args
     */
    private static LinkedList<HuffNode> huffList = new LinkedList<HuffNode>();//容器存放节点值

    class HuffNode implements Comparable<HuffNode> {
        int value;
        String name;
        HuffNode Lchild = null;
        HuffNode Rchild = null;

        public HuffNode() {

        }

        public HuffNode(int v, String s) {
            value = v;
            name = s;
        }

        public HuffNode(HuffNode l, HuffNode r) {
            Lchild = l;
            Rchild = r;
            value = Lchild.value + Rchild.value;

        }

        @Override
        public int compareTo(HuffNode node1) {
            if (value < node1.value) {
                return -1;
            } else if (value == node1.value) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    //哈夫曼编码
    public static void HuffmanCode() {
        if (huffList.size() == 1) {
            return;
        }
        while (huffList.size() > 1) {
            Collections.sort(huffList);
            HuffNode node = new Main().new HuffNode(huffList.get(0), huffList.get(1));
            huffList.remove();
            huffList.remove();
            huffList.add(node);
        }//此时hufList中只有一个元素，这就是编码后的哈夫曼树的根节点
    }

    //解码，后序遍历
    public static void decode(HuffNode n, String code) {
        if ((n.Lchild == null) && (n.Rchild == null)) {
            System.out.print(n.name + " ---> " + code);
            System.out.println();
            return;
        }
        decode(n.Lchild, code + "0");
        decode(n.Rchild, code + "1");
        return;
    }

    public static void main(String[] args) {
        System.out.println("Please input: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//待编码元素个数
        for (int i = 0; i < N; i++) {
            huffList.add(new Main().new HuffNode(scanner.nextInt(), scanner.next()));
        }
        HuffmanCode();
        decode(huffList.get(0), "");
    }
}
