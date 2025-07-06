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

    int preidx = 0;
    Map<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return build(preorder,0,inorder.length-1);

    }

    public TreeNode build(int[] preorder,int start,int end){

        if(start>end) return null;

        int val = preorder[preidx];
        preidx++;
        TreeNode root = new TreeNode(val);

        int inIdx = map.get(val);

        root.left = build(preorder,start,inIdx-1);
        root.right = build(preorder,inIdx+1,end);

        return root;

    }
}