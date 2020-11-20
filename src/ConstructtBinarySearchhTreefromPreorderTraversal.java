public class ConstructtBinarySearchhTreefromPreorderTraversal {

    public static void main(String[] args) {
        int [] ints = {8,5,1,7,10,12};
        bstFromPreorder(ints);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            treeTraversal(root,preorder[i]);
        }
        return root;
    }
    private static void treeTraversal(TreeNode node,int val){
        if(node.val > val){
            if(node.left == null){
                node.left = new TreeNode(val);
                return;
            }else {
                treeTraversal(node.left,val);
            }
        }else{
            if(node.right == null){
                node.right = new TreeNode(val);
                return;
            }else {
                treeTraversal(node.right,val);
            }
        }
    }
}
