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
    
                
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        
        if(root == null) return result;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            result.add(new ArrayList<>());
            int n = queue.size();
            
            for(int i = 0; i < n; i++) {
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if(queue.peek().right!=null) queue.add(queue.peek().right);
                result.get(level).add(queue.peek().val);
                queue.remove();
            }
            
            level++;
        }
        
        return result;
    }
    
}