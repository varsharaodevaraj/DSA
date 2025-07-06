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
    
    int postIdx;
    Map<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIdx = postorder.length-1;

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(postorder,0,postorder.length-1);
        
    }
    public TreeNode build(int[] postorder,int start,int end){
        
        if(start>end) return null;

        int val = postorder[postIdx];
        postIdx--;
        TreeNode root = new TreeNode(val);

        int inIdx = map.get(val);

        root.right = build(postorder,inIdx+1,end);
        root.left = build(postorder,start,inIdx-1);

        return root;

    }
}