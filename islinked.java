class Node {
    int data;
    Node next;

    Node(int val){
        this.data = val;
        this.next = null;

    }
}

class Linkedlist{
    Node head = null;
    // print linked list
    public void print(){
        Node ptr = head;
        while(ptr != null){
            System.out.print(ptr.data + "-->");
            ptr = ptr.next;
        }
        System.out.print("null");
    }
    // add in first
    public void addLast(int val){
        Node newnode = new Node(val);
        if(this.head == null) this.head = newnode;
        else{
            Node ptr = head;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = newnode;
        }

    }
    public void addFirst(int val){
        Node newnode = new Node(val);
        if(this.head == null) this.head = newnode;
        else{
            newnode.next = head;
            head = newnode;
        }
    }

    public boolean isexist(int target){
        if(this.head == null) return false;
        Node ptr = this.head;
        while(ptr != null){
            if(ptr.data == target) return true;
            ptr = ptr.next;

        }
        return false;
    }
    public boolean isequals(Linkedlist lt){
        Node ptr = this.head;
        Node sptr = lt.head;
        while(ptr != null && sptr != null){
            if(ptr.data != sptr.data) return false;
            sptr = sptr.next;
            ptr = ptr.next;
        }
        return (ptr == null && sptr == null);
    }

}


public class islinked {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addLast(20);
        ll.addLast(50);
        ll.addLast(80);
        ll.addLast(89);
        ll.addLast(25);
        Linkedlist dl = new Linkedlist();
        dl.addLast(20);
        dl.addLast(50);
        dl.addLast(80);
        dl.addLast(89);
        dl.addLast(25);

//        ll.print();
        System.out.println();
        System.out.println(ll.isequals(dl));

    }
}
