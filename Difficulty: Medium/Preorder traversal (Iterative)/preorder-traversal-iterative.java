// User function Template for Java

/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree {
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        Stack<Node> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            
            root = st.pop();
            list.add(root.data);
            
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);
            
        }
        
        return list;
        
    }
}