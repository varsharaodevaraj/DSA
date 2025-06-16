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
class Solution {
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null) return list;
        
        Stack<Node> st = new Stack<>();
        Node curr = root;
        
        while(curr!=null || !st.isEmpty()){
            
            while(curr!=null){
                st.push(curr);
                curr = curr.left;
            }
            
            curr = st.pop();
            list.add(curr.data);
            curr = curr.right;
            
        }
        
        return list;
    }
}