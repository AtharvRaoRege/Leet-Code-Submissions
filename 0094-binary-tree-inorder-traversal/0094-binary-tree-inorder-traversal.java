/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public static List<Integer> inorder (TreeNode root,List<Integer>li){
        if(root == null) return new ArrayList<Integer>();
        inorder(root.left,li);
        li.add(root.val);
        inorder(root.right,li);
        return li;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        TreeNode temp = root;
        return inorder(temp,li);
    }
}