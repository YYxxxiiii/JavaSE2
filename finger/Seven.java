package finger;


import javax.swing.tree.TreeNode;
import java.util.Arrays;

class TreeNode1{
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1(int x) {
        val = x;
    }
}
public class Seven {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if (n == 0) {
            return null;
        }
        int rootVal = preorder[0];
        int rootIndex = 0;
        for (int i = 0; i < n; i++) {
            if (inorder[i] == rootVal) {
                rootIndex = i;
                break;
            }
        }
        TreeNode1 root = new TreeNode1(rootVal);
        root.left = (TreeNode1) buildTree(Arrays.copyOfRange(preorder,1,1+rootIndex),Arrays.copyOfRange(inorder, 0, rootIndex));
        root.right = (TreeNode1) buildTree(Arrays.copyOfRange(preorder,1+rootIndex, n), Arrays.copyOfRange(inorder, rootIndex + 1, n));

        return (TreeNode) root;
    }
}
