// User function Template for Java

class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        if(arr==null || arr.length == 0) return null;
        
        Node head = new Node(arr[0]);
        Node curr = head;
        
        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            newNode.prev = curr;
            curr.next = newNode;
            curr = newNode;
        }
        
        return head;
    }
}