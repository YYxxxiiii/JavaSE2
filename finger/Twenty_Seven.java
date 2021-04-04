package finger;

import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Twenty_Seven {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);
        root.left = leftRoot;
        root.right = rightRoot;
        return root;
    }

//    class Solution {
//        public TreeNode mirrorTree(TreeNode root) {
//            if (root == null) return null;
//            Stack<TreeNode> stack = new Stack<>() {{
//                add(root);
//            }};
//            while (!stack.isEmpty()) {
//                TreeNode node = stack.pop();
//                if (node.left != null) stack.add(node.left);
//                if (node.right != null) stack.add(node.right);
//                TreeNode tmp = node.left;
//                node.left = node.right;
//                node.right = tmp;
//            }
//            return root;
//        }
//    }
}
