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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if(root==null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean isLeftRight = true;

         while (!q.isEmpty()) {
            int levelSize = q.size();
            LinkedList<Integer> subList = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();

                if (isLeftRight) {
                    subList.addLast(curr.val);
                } else {
                    subList.addFirst(curr.val);
                }

                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }

            list.add(subList);
            isLeftRight = !isLeftRight;
        }

        return list;

    }
}