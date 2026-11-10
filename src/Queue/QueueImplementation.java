package Queue;

// Implementation of stack via Queue... 

import java.util.*;

// push efficient appr...
class StackViaQueue{
    Queue<Integer> q = new LinkedList<>();
    
    public StackViaQueue(){

    }
    public void add(int ele){
        q.add(ele);
    }

    public int remove(){

        int n = q.size();
        int i = 0;
        while(i < n - 1){
            q.add(q.remove());
            i++;
        }
        return q.remove();
        
    }
    public int peek(){
        int n = q.size();
        int i = 0;
        while(i < n - 1){
            q.add(q.remove());
            i++;
        }
        int peek = q.peek();
        q.add(q.remove());

        return peek;
    }
    public void display(){

        for(int i = 0; i < q.size(); i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

}


class StackViaQueue2{
    Queue<Integer> q = new LinkedList<>();
    
    public StackViaQueue2(){

    }
    public void add(int ele){
        q.add(ele);
        int n = q.size();

        for(int i = 1; i <= n - 1; i++){
            q.add(q.remove());
        }
    }

    public int remove(){
        return q.remove();        
    }
    public int peek(){
        return q.peek();
    }
    public void display(){

        for(int i = 0; i < q.size(); i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

}
public class QueueImplementation {
    public static void main(String[] args) {
        
        StackViaQueue2 q = new StackViaQueue2();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());

    }
}
