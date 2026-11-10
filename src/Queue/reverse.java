package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverse {
    
    public static void main(String[] args) {
        
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.add(q.remove());
        }

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        System.out.println(q);
    }
}
