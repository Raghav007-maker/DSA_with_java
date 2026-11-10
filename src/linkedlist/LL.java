package src.linkedlist;


public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }
    
    public void LastInput(int value){
        if(tail==null){
            FirstInput(value);
            return;
        }
        Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val=tail.value;
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        return val;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }

        Node prev=get(index-1);
        int value=prev.next.value;

        prev.next=prev.next.next;

        return value;
    }

    public int find(int value){
        int index=0;
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return index;
            }
            index++;
            node=node.next;
        }
        return -1;
    }

    public Node get(int index){
        Node node=head;

        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void insert(int value,int index){
        if(index==0){
            FirstInput(value);
            return;
        }
        if(index==size){
            LastInput(value);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    
    public void FirstInput(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}