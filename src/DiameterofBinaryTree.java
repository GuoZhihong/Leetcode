public class DiameterofBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static int max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        treeTraverse(root);
        return max;
    }
    private static int treeTraverse(TreeNode node){

        if(node == null){
            return 0;
        }

        int left = treeTraverse(node.left);
        int right = treeTraverse(node.right);
        max = Math.max(max,left + right);
        return Math.max(left,right) + 1 ;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;
        treeNode2.left = treeNode4;

        System.out.println(diameterOfBinaryTree(treeNode1));
    }
}
