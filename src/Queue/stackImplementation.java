package Queue;


// Queue implementaton via stack..
import java.util.Stack;

// add-efficient approch
class Queuestack{
    private  Stack<Integer> st;
    private  Stack<Integer> helper;
    
    public Queuestack(){
        st = new Stack<>();
        helper = new Stack<>();
    }

    public void add(int ele){ //O(1)
        st.push(ele);
    }
    
    public int remove(){ //O(n)
        while(st.size() > 1){
            helper.push(st.pop());
        }
        int removed = st.pop();

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }

        return removed;
    }
    
    public int peek(){ //O(n)
        
        while(st.size() > 1){
            helper.push(st.pop());
        }
        int top = st.peek();

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }

        return top;
    }

    public void display(){
        for(int ele : st){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}

// pop-efficient approch
class queue2nd{
    private  Stack<Integer> st;
    private  Stack<Integer> helper;
    
    public queue2nd(){
        st = new Stack<>();
        helper = new Stack<>();
    }

    public void add(int ele){ //O(n)
        while(!st.isEmpty()){
            helper.add(st.pop());
        }

        st.push(ele);

        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
    
    public int remove(){ //O(n)
        return st.pop();
    }
    
    public int peek(){ //O(n)
        return st.peek();
    }

    public void display(){
        for(int ele : st){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}


public class stackImplementation {
    public static void main(String[] args) {
        Queuestack q = new Queuestack();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.peek());
        q.display();
        
        System.out.println("2nd Implementaion");

        queue2nd q2 = new queue2nd();
        q2.add(10);
        q2.add(20);
        q2.add(30);
        q2.add(40);
        q2.add(50);
        q2.display();
        System.out.println(q2.remove());
        q2.display();
        System.out.println(q2.peek());
        q2.display();
    }
}
