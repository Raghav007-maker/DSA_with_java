package src.linkedlist;

public class DLL {

    Node head;

    public void InsertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void Display(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.value+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("End");

        System.out.println("Print In Reverse:");

        while(last!=null){
            System.out.print(last.value+ "->");
            last=last.prev;
        }
        System.out.println("START");
    }

    public void InsertLast(int value){
        Node node=new Node(value);
        Node last=head;

        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;

    }


    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert(int after,int val){
        Node p= find(after);

        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;

        if(node.next!=null){
            node.next.prev=node;
        }
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

        public Node(int value) {
            this.value= value;
        }
    }
}
