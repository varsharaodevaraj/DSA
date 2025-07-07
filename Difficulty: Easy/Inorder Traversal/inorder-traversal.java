/* A Binary Tree node

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    // Function to return a list containing the inorder traversal of the tree.
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer> list = new ArrayList<>();
        Node current = root;
        
        while(current!=null){
            if(current.left == null){
                list.add(current.data);
                current = current.right;
            }else{
                Node pred = current.left;
                while(pred.right != null && pred.right != current){
                    pred = pred.right;
                }
                
                if(pred.right == null){
                    pred.right = current;
                    current = current.left;
                }else{
                    pred.right = null;
                    list.add(current.data);
                    current = current.right;
                }
            }
        }
            
        return list;
    }
}