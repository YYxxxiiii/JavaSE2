package interviewTree;


/*
* 判断是否为完全二叉树
*/
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class IsCompleteTree {
    public boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean isSecondStep = false;

        //针对这棵树进行层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (!isSecondStep){
                //这是第一阶段
                if (cur.left != null && cur.right != null) {
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if (cur.left == null && cur.right != null) {
                    //只有右子树,那一定不是完全二叉树
                    return false;
                } else if (cur.left != null && cur.right == null) {
                    //切换到第二阶段
                    isSecondStep = true;
                    queue.offer(cur.left);
                } else {
                    //左右子树都为空的时候,也要切换到第二阶段
                    //要求第二阶段中任何一个节点都必须没有子树
                    //只要找到某个节点带子数,那就说明找到了反例
                    if (cur.left != null || cur.right != null) {
                        return false;
                    }
                }
            }
            //整个树都便利完了,也没有找到反例的话,那最终就是return true,认为是完全二叉树
        }
        return true;
    }

}
