package src.doublyLL;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next= null;
        this.prev = null;
    }
}

public class DLL {
    Node head;
    Node tail;
    int size;

    public void addAtHead(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            tail = n;
            
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }

    public void addAtTail(int data){
        Node n = new Node(data);
        if(tail == null) addAtHead(data);
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }

    public void deleteAtHead(){
        
        if(head == null) return;

        if(size == 1){
            head = tail = null;
        }

        else{
            Node temp = head.next;
            temp.prev = null;
            head = temp;
        }
        size--;
    }
    public void deleteAtTail(){
        
        if(tail == null) return;
        
        if(size == 1){
            head = tail = null;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayReverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insert(int idx, int data){

        if(idx < 0 || idx > size){
            System.out.println("Invalid Index");
            return;
        }
        if(idx == 0) {
            addAtHead(data);
            return;
        }
        if(idx == size){
             addAtTail(data);
            return;
        }

        Node n = new Node(data);
        int i = 1; 
        Node temp = head;
        while(i <= idx - 1){
            temp = temp.next;
            i++;
        }
        n.next = temp.next;
        temp.next.prev = n;
        temp.next = n;
        n.prev = temp;
        size++;
    }

    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.addAtHead(10);
        dll.addAtHead(15);
        dll.addAtHead(67);
        dll.addAtHead(25);
        dll.addAtHead(18);
        dll.display();
        dll.displayReverse();
        // dll.deleteAtHead();
        // dll.deleteAtTail();
        // dll.display();
        dll.insert(3,100);
        dll.displayReverse();
    }
}
