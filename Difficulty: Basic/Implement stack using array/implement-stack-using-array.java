class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        // Your Code
        if (top == arr.length - 1) {
            return;
        }
        top++;
        arr[top] = x;
    }

    public int pop() {
        // Your Code
        if (top == -1) {
            return -1;
        }
        
        int value = arr[top];
        top--;
        return value;
    }
}