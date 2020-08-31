package interviewTree;

import java.util.Scanner;

public class BuildTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        while (sc.hasNext()) {
            // line 这个字符串就表示:一组形如 "abc##de#g##f###" 的输入数据
            String line = sc.next();
            TreeNode root = build(line);
            inOrder(root);
            System.out.println();
        }
    }

    //中序遍历
    //左根右
    private static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.val + " ");
        inOrder(root.right);
    }

    private static int index = 0;
    private static TreeNode createTreePreOrder(String line) {
        char cur = line.charAt(index);
        if (cur =='#') {
            return null;
        }
        // 当前字符不是 # 就创建一个节点
        TreeNode root = new TreeNode(cur);
        index++;    // 准备处理下一个节点. 下一个节点开始就是当前 root 左子树的先序遍历结果
        root.left = createTreePreOrder(line);
        index++;
        root.right = createTreePreOrder(line);
        return root;
    }
}
