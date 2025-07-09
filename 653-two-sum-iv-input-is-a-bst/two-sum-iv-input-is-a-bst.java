import java.util.Stack;

class Solution {
    class BSTIterator {
        Stack<TreeNode> stack = new Stack<>();
        boolean reverse;

        // Constructor: reverse == false for in-order, true for reverse in-order
        public BSTIterator(TreeNode root, boolean reverse) {
            this.reverse = reverse;
            pushAll(root);
        }

        // Return next smallest or largest
        public int next() {
            TreeNode node = stack.pop();
            if (!reverse) {
                pushAll(node.right); // in-order → go right
            } else {
                pushAll(node.left);  // reverse in-order → go left
            }
            return node.val;
        }

        // Push all left/right children depending on traversal direction
        private void pushAll(TreeNode node) {
            while (node != null) {
                stack.push(node);
                node = reverse ? node.right : node.left;
            }
        }       

        public boolean hasNext() {
            return !stack.isEmpty();
        }
    }

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;

        BSTIterator left = new BSTIterator(root, false); // in-order
        BSTIterator right = new BSTIterator(root, true); // reverse in-order

        int i = left.next();
        int j = right.next();

        while (i < j) {
            int sum = i + j;
            if (sum == k) return true;
            else if (sum < k) {
                if (left.hasNext()) i = left.next();
                else return false;
            } else {
                if (right.hasNext()) j = right.next();
                else return false;
            }
        }

        return false;
    }
}
