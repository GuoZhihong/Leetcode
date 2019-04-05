/*
* 104. Maximum Depth of Binary Tree
Easy

1213

47

Favorite

Share
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
* */



public class MaximumDepthofBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public static void main(String[] args) {
        TreeNode node = new TreeNode(15);
        TreeNode node1 = new TreeNode(7);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(9);
        TreeNode root = new TreeNode(3);
        node2.left = node;
        node2.right = node1;
        root.left = node3;
        root.right = node2;
        System.out.println(maxDepth(root));
    }
    static int depth;
    public static int maxDepth(TreeNode root) {
        /*my solution was wrong,the following is ans */
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left)+1;
        int r = maxDepth(root.right)+1;
        if(l >= r){
            return l;
        }else {
            return r;
        }
    }
}
