

/**
 * @Author: liuchi
 * @Date: 2019/8/21 20:14
 */
public class ReBuildTree {
    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        ReBuildTree reBuildTree = new ReBuildTree();
        TreeNode root = reBuildTree.reConstructBinaryTree(pre,in);
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null) {
            return null;
        }
        if(pre.length!=in.length) {
            return null;
        }
        if(pre.length>0 && in.length>0){
            TreeNode root=new TreeNode(pre[0]);
            if(pre.length==1) {
                return root;
            }
            for(int i=0; i<in.length;i++){
                if(pre[0]==in[i]){
                    int[] leftPre=getSubArr(pre,1,i+1);
                    int[] leftIn=getSubArr(in,0,i);
                    int[] rightPre=getSubArr(pre,i+1,pre.length);
                    int[] rightIn=getSubArr(in,i+1,in.length);
                    root.left=reConstructBinaryTree(leftPre,leftIn);
                    root.right=reConstructBinaryTree(rightPre,rightIn);
                }
            }
            return root;
        }
        return null;

    }

    private int[] getSubArr(int[] old, int start, int end){
        int[] arr=new int[end-start];
        for(int i=0; i<arr.length;i++){
            arr[i]=old[start+i];
        }
        return arr;
    }
}
