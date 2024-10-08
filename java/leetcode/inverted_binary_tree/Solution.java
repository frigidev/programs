/*
  Resolution of the problem 226 of Leetcode Invert Binary Tree, where given a binary tree,
  the method must return that tree inverted.
*/

class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if(root == null) {
            return;
        }

        TreeNode aux = root.left;
        root.left = root.right;
        root.right = aux;

        invert(root.left);
        invert(root.right);
    }
}
