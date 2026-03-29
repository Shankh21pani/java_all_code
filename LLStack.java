class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
 class LLStack {
    private Node top;
    public LLStack(){
        top = null;
    }
    public void push(int val){
        Node newNode = new Node(val);
        if(top == null) top = newNode;
        newNode.next = top;
        top = newNode;

    }
    public int pop(){
        if(top == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        int res = top.data;
        top = top.next;
        return res;

    }
    public int peek(){
        if(top == null){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }

     public static void main(String[] args) {
         LLStack stack = new LLStack();
         System.out.println(stack.pop());

         stack.push(40);
         System.out.println(stack.peek());
         stack.push(500);
         stack.push(600);
         stack.push(700);

         System.out.println(stack.peek());


     }
}
