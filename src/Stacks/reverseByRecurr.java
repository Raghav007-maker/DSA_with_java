package Stacks;

import java.util.*;

public class reverseByRecurr {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() <= 1){
            return;
        }
        int item = st.pop();
        reverse(st);
        PushAtBottom(st, item);
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
