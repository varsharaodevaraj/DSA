class BSTIterator {
    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        updateStack(root);  // Push all left descendants to stack
    }

    public int next() {
        TreeNode toRemove = stack.pop();
        updateStack(toRemove.right);  // Explore the right subtree
        return toRemove.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    // Push all left nodes of the subtree onto the stack
    public void updateStack(TreeNode node) {
        while (node != null) {
            stack.add(node);
            node = node.left;
        }
    }
}
