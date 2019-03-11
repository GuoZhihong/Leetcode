/*
* Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:

Input:
	Tree 1                     Tree 2
          1                         2
         / \                       / \
        3   2                     1   3
       /                           \   \
      5                             4   7
Output:
Merged tree:
	     3
	    / \
	   4   5
	  / \   \
	 5   4   7


Note: The merging process must start from the root nodes of both trees.
*
*
* */
public class MergeTwoBinaryTrees {
    /**
     * Definition for a binary tree node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {// done in 25 mins
        TreeNode t1 = new TreeNode(1);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(2);
        TreeNode left1 = new TreeNode(5);
        left.left = left1;
        t1.left = left;
        t1.right = right;

        TreeNode t2 = new TreeNode(2);
        TreeNode leftx = new TreeNode(1);
        TreeNode rightx = new TreeNode(3);
        TreeNode rightx1 = new TreeNode(4);
        TreeNode rightx2 = new TreeNode(7);
        leftx.right = rightx1;
        rightx.right = rightx2;
        t2.right = rightx;
        t2.left = leftx;
        TreeNode x = mergeTrees(t1,t2);
    }
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t3 = null;
        if(t1 != null && t2 != null){
            t3  = new TreeNode(t1.val+t2.val);
        }else if(t1 == null){
            return t2;
        }else if(t2 == null){
            return t1;
        }

        if(t1.left != null && t2.left != null) {
            t3.left = mergeTrees(t1.left, t2.left);
        }
        if(t1.right != null && t2.right != null) {
            t3.right = mergeTrees(t1.right, t2.right);
        }
        if(t1.right == null && t2.right != null){
            t3.right = t2.right;
        }
        if(t1.right != null && t2.right == null){
            t3.right = t1.right;
        }
        if(t1.left == null && t2.left != null){
            t3.left = t2.left;
        }
        if(t1.left != null && t2.left == null){
            t3.left = t1.left;
        }
        return t3;
    }
}
