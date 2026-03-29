public class MyStack {
    private int arr[];
    private int top;
    int capacity;

    public MyStack(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        System.out.println(stack.pop());

        stack.push(5);

        System.out.println(stack.peek());
        stack.push(50);



    }
    public void push(int val){
        if(top == capacity-1){
            System.out.println("Stack Overflow !!||!!");
            return;
        }
        top++;
        arr[top] = val;

    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underFlow");
            return -1;
        }
        int res = arr[top];
        top--;
        return res;

    }
    public int peek(){
        return arr[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
