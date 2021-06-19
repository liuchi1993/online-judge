/**
 * @Author: liuchi
 * @Date: 2019/8/19 21:34
 */
public class KthInTree {
    public Integer getKthInTree(TreeNode root, int k){
        if (root == null || k == 0){
            return null;
        }
        int count = getCount(root.left);
        if (count == k - 1){
            return root.val;
        }else if (count > k - 1) {
            return getKthInTree(root.left, k);
        }else {
            return getKthInTree(root.right, k - count - 1);
        }
    }

    private int getCount(TreeNode root) {
        if (root == null){
            return 0;
        }
        return getCount(root.left) + 1 + getCount(root.right);
    }
}
