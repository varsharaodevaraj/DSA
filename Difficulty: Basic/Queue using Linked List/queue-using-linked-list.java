/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        QueueNode newNode = new QueueNode(a);
        if(rear==null){
            rear = newNode;
            front = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
        // Your code here
        if(front==null) return -1;
        int val = front.data;
        front = front.next;
        
        if(front==null) rear = null;
        
        return val;
	}
}




