package Queue;
class Node{
    
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class myQueue {
    Node head;
    Node tail;
    int size;

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int peek(){
        if(size == 0) return -1;
        return head.data;
    }

    public int remove(){
        if(size == 0) return -1;
        int removed = head.data;
        head = head.next;
        size--;
        return removed; 
    }

    public void add(int ele){

        Node n = new Node(ele);
        if(size == 0){
            head = n;
            tail = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    } 

}
