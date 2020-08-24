package InterviewTree;

//用后续遍历的方式,求二叉树中节点的个数

//整个树的节点个数 = 根节点的个数(1) + 左子树节点的个数 + 右子树的节点个数
public class BinaryTreeSize {
    public static int size(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    //求二叉树叶子结点的个数
    //整个树的叶子节点的个数 = root.left的叶子结点的个数 + root.right叶子结点个数
    public static int leafSize(Node root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
            //此时的root没有子树,root自己就是叶子结点 
        }
        return leafSize(root.left) + leafSize(root.right);
    }

    //求二叉树的第k层节点的个数
    //从0开始的
    //如果 k < 1 只能是空树. 直接返回 0
    // 如果 k == 1 求根节点的个数. 直接返回 1
    // k 层节点的个数 = 左子树的 k - 1 层节点个数 + 右子树的 k - 1 层节点个数.
    public static int kLevelSize(Node root,int k) {
        if(k < 1 || root == null) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        return kLevelSize(root.left,k - 1) + kLevelSize(root.right,k - 1);
    }

    //在二叉树中查找指定元素
    //如果存在就返回该节点的引用,如果不存在,返回null
    //核心思路还是 遍历
    Node find(Node root,char toFind) {
        if (root == null) {
            return null;
        }
        if (root.val == toFind) {
            return root;
        }
        //分别递归的去查找左右子树
        Node result = find(root.left,toFind);
        if (result != null) {
            return result;
        }
        return find(root.right,toFind);
    }
}
