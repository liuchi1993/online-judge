/**
 * @Author: liuchi
 * @Date: 2019/9/1 22:32
 * 判断B是否是A的子树
 */
public class HasSubTree {
    public boolean hasSubTree(TreeNode root1, TreeNode root2){
        if (root1 == null || root2 == null){
            return false;
        }
        return isSubTree(root1,root2)
            || hasSubTree(root1.left, root2)
            || hasSubTree(root1.right, root2);
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val == root2.val){
            return isSubTree(root1.left,root2.left) && isSubTree(root1.right,root2.right);
        }else {
            return false;
        }
    }
}
