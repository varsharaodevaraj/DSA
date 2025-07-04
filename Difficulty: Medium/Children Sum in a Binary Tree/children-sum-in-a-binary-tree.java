/*Complete the function below
Node is as follows:
class Node{
    int data;
    Node left,right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

*/
class Solution {
    // Function to check whether all nodes of a tree have the value
    // equal to the sum of their child nodes.
    public static int isSumProperty(Node root) {
        // add your code here
        if(root == null) return 1;
        
        if(helper(root) == true) return 1;
        
        return 0;
        
        
    }
    
    public static boolean helper(Node root){
        
        if(root == null || (root.left == null && root.right == null)){
            return true;
        }
        
        int leftVal = root.left != null ? root.left.data : 0;
        int rightVal = root.right != null ? root.right.data : 0;
        
        if(root.data == (leftVal+rightVal)){
            return helper(root.left) && helper(root.right);
        }
        
        return false;
        
    }
}