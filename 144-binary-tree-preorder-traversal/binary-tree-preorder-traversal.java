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
    public void help(TreeNode root,ArrayList<Integer> list){

        if(root==null){
            return;
        }

        list.add(root.val);
        help(root.left,list);
        help(root.right,list);

    }
    public List<Integer> preorderTraversal(TreeNode root) {

        ArrayList<Integer> list = new ArrayList<>();
        help(root,list);
        return list;

    }
}