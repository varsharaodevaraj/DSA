/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,Node head) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(head==null) return list;
        Node l = head;
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        Node r = temp;
        while(l!=r && r.next!=l){
            int sum = l.data + r.data;
            if(sum>target){
                r = r.prev;
            }else if(sum<target){
                l = l.next;
            }else if(sum==target){
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(l.data);
                arr.add(r.data);
                list.add(arr);
                l = l.next;
                r = r.prev;
            }
        }
        return list;
    }
}
