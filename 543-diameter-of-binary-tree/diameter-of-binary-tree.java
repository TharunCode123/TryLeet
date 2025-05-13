/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {  //not an optimised appraoch  O n2 .
    public int maxheight(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 +  Math.max(maxheight(root.left) , maxheight(root.right));// height for node
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftheight = maxheight(root.left);//passing to check  height
        int rightheight = maxheight(root.right);
        int dia = leftheight + rightheight;
        //we will check height for subtree to make sure
        int sub = Math.max(diameterOfBinaryTree(root.left) ,diameterOfBinaryTree(root.right));
        return Math.max(dia , sub);
    }
}