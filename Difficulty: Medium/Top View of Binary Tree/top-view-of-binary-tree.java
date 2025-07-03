/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    
    static class Pair{
        
        Node node;
        int hd;
        
        Pair(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
        
    }
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null) return arr;
        
        Queue<Pair> q = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;
            
            if(!map.containsKey(hd)){
                map.put(hd,node.data);
            }
            
            if(node.left!=null) q.add(new Pair(node.left,hd-1));
            if(node.right!=null) q.add(new Pair(node.right,hd+1));
            
        }
        
        for(int val : map.values()){
            arr.add(val);
        }
        
        return arr;
        
    }
}