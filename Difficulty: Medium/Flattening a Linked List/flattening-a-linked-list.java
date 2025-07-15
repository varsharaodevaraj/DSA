class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if(root==null || root.next==null) return root;
        
        root.next = flatten(root.next);
        root = merge(root,root.next);
        
        return root;
        
    }
    
    Node merge(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        
        
        Node res;
        if(a.data<b.data){
            res = a;
            res.bottom = merge(a.bottom,b);
        }else{
            res = b;
            res.bottom = merge(a,b.bottom);
        }
        
        res.next = null;
        return res;
    }
}