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

    int ind = 0;  // index tracking the current element in preorder

    public TreeNode find(int[] preorder,int mx, int n) {

        if (ind >= n || preorder[ind] >= mx) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[ind++]);
        root.left = find(preorder, root.val, n);
        root.right = find(preorder, mx, n);
        return root;

    }

    public TreeNode bstFromPreorder(int[] preorder) {

        ind = 0;
        int n = preorder.length;
        return find(preorder, Integer.MAX_VALUE, n);

    }

}