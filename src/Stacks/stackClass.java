package Stacks;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class myStack{
    Node head;
    int len;

    public int peek() throws Exception{
        if(head == null){
            throw new Exception("Stack UnderFlow");
        }
        return head.data;
    }

    int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack UnderFlow");
        }
        int x = head.data;
        head = head.next;
        len--;
        return x;
    }

    void push(int ele){
        Node temp = new Node(ele);
        if(len == 0) head = temp;
        else{
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int size(){
        return len;
    }

    void display(){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
}
public class stackClass {
    public static void main(String[] args) throws Exception{
        myStack st = new myStack();
        st.pop();
        st.push(12);
        st.push(46);
        st.push(186);
        st.push(127);
        st.display();
    }
}
