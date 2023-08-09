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
class Solution {
    private List<Integer> result = new ArrayList<>();
    
    public List<Integer> preorderTraversal(TreeNode root) {
        printNode(root);
        return result;
    }
    
    public void printNode(TreeNode root){
        if(root == null)
            return;
        result.add(root.val);
        printNode(root.left);
        printNode(root.right);
    }
}