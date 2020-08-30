package interviewTree;

import java.util.LinkedList;
import java.util.Queue;

//二叉树的层序遍历
public class LevelOrder {
    public void levelOrder(TreeNode root) {
        //借助队列来实现层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.val + " ");
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
    }
}
