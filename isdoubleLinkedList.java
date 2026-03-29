class node {
    int data;
     node next;
    node prev;

    node(int data){
        this.data = data; //In detailed
        this.next = null;
        this.prev = null;
    }
}
class doubly{
    node head = null;
    public void addLast(int data){
        node newnode = new node(data);
        if(this.head == null){
            this.head = newnode;
        }
        else{
            node ptr = this.head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newnode;
            newnode.prev = ptr;
        }

    }
    public void addFirst(int data){
        if(this.head == null){
            node n = new node(data);
            head = n;
        }
        else{
            node n = new node(data);
            n.next = head;
            head.prev = n;
            head = n;

        }

    }
    public void print(){
        node ptr = head;
        while(ptr != null){
            System.out.print("<-- " +ptr.data + " -->");
            ptr = ptr.next;
        }

    }

}



public class isdoubleLinkedList {
    public static void main(String[] args) {
        doubly d = new doubly();
        d.addLast(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);
        d.addLast(50);
        d.print();

    }
}
