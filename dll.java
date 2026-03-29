class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedlist {
    Node head = null;

    public void addfirst(int val){
        Node newnode = new Node(val);
        if(head != null){
            newnode.next = head;
            head.prev = newnode;
        }
        head = newnode;

    }
    public void addLast(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = newnode;
        }
        else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newnode;
            newnode.prev = ptr;

        }


    }
    public void deletefirst(){
        if(head == null){
            System.out.println("Null list");
        }
        else{
            head = head.next;
            head.prev = null;

        }
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Null list");
        }
        else{
            Node ptr = head;

            while(ptr.next != null && ptr.next.next != null){
                ptr = ptr.next;
            }
            ptr.next = null;
        }
    }

    public void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "<->");
            ptr = ptr.next;
        }
        System.out.print("End");
    }
    public void printb(){
        if(head == null) return;
        else{
            Node ptr1 = head;
            while(ptr1.next != null){
                ptr1 = ptr1.next;
            }
            while(ptr1 != null) {
                System.out.print(ptr1.data + "<->");
                ptr1 = ptr1.prev;
            }
        }
    }

}


public class dll {
    public static void main(String[] args) {
        DoublyLinkedlist dl = new DoublyLinkedlist();
        dl.addLast(17);
        dl.addLast(120);
        dl.addLast(177);
        dl.addLast(11);
//        dl.printb();
//        dl.deleteLast();
//        dl.deletefirst();
        dl.print();


    }

}
