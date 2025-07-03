/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    
    public boolean isLeaf(Node node) {
        return node != null && node.left == null && node.right == null;
    }
    
    public void addLeftBoundary(Node node, ArrayList<Integer> arr) {
        while (node != null) {
            if (!isLeaf(node)) arr.add(node.data);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }
    
    public void addRightBoundary(Node node, ArrayList<Integer> arr) {
        Stack<Integer> st = new Stack<>();

        while (node != null) {
            if (!isLeaf(node)) st.push(node.data);
            if (node.right != null) node = node.right;
            else node = node.left;
        }

        while (!st.isEmpty()) {
            arr.add(st.pop());
        }
    }
    
    public void addLeaves(Node node, ArrayList<Integer> arr) {
        if (node == null) return;

        if (isLeaf(node)) {
            arr.add(node.data);
            return;
        }

        addLeaves(node.left, arr);
        addLeaves(node.right, arr);
    }
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        ArrayList<Integer> arr = new ArrayList<>();

        if (node == null) return arr;

        if (!isLeaf(node)) arr.add(node.data);

        addLeftBoundary(node.left, arr);
        addLeaves(node, arr);
        addRightBoundary(node.right, arr);

        return arr;
    }
}
