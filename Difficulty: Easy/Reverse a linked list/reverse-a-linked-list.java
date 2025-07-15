// function Template for Java

/* linked list node class:

class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev = null;
        while(head!=null){
            Node newNode = head.next;
            head.next = prev;
            prev = head;
            head = newNode;
        }
        return prev;
    }
}