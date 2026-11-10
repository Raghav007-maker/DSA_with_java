package Stacks;

import java.util.Stack;

public class pushAtLast {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);
        PushAtBottom(st, 50);
    }

    public static void PushAtBottom(Stack<Integer> st, int n){
        if(st.size() == 0){
            st.push(n);
            return;
        }
        int top = st.pop(); 
        PushAtBottom(st, n);
        st.push(top);
    }
}
