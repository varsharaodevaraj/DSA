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
    class Pair{

        TreeNode node;
        int index;

        Pair(TreeNode node,int index){
            this.node = node;
            this.index = index;
        }

    }
    public int widthOfBinaryTree(TreeNode root) {

        if(root==null) return 0;

        int maxWidth = 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));

        while(!q.isEmpty()){

            int size = q.size();
            int min = q.peek().index;

            int first = 0;
            int last = 0;

            for(int i=0;i<size;i++){

                Pair current = q.poll();
                TreeNode node = current.node;
                int index = current.index - min;

                if(i==0) first = index;
                if(i==size-1) last = index;

                if(node.left != null) q.offer(new Pair(node.left,2*index+1));
                if(node.right != null) q.offer(new Pair(node.right,2*index+2));

            }

            maxWidth = Math.max(maxWidth,(last-first+1));
        }
        
        return maxWidth;
    }
}