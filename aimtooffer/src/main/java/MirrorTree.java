/**
 * @Author: liuchi
 * @Date: 2019/9/1 22:44
 * 二叉树的镜像
 */
public class MirrorTree {
    public void Mirror(TreeNode root){
        if (root == null){
            return;
        }
        mirrorOf(root);
    }

    private TreeNode mirrorOf(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;
        root.left = mirrorOf(rightTree);
        root.right = mirrorOf(leftTree);
        return root;

    }

}
