import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @Author: liuchi
 * @Date: 2019/8/19 19:29
 */
public class ZigzagLevelOrderTree {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return null;
        }
        Stack<TreeNode> stack0 = new Stack<TreeNode>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        int level = 0;
        stack0.push(root);
        while ( !stack0.isEmpty() || !stack1.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<Integer>();
            if (level % 2 == 0){
                while (!stack0.isEmpty()){
                    TreeNode node = stack0.pop();
                    temp.add(node.val);
                    if (node.left != null){
                        stack1.push(node.left);
                    }
                    if (node.right != null){
                        stack1.push(node.right);
                    }
                }
                if (temp != null && temp.size() > 0){
                    result.add(temp);
                    level++;
                }
            } else {
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    temp.add(node.val);
                    if (node.right != null){
                        stack0.push(node.right);
                    }
                    if (node.left != null){
                        stack0.push(node.left);
                    }
                }
                if (temp != null && temp.size() > 0){
                    result.add(temp);
                    level++;
                }
            }
            temp = null;
        }
        return result;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
