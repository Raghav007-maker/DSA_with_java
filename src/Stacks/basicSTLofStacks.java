package Stacks;

import java.util.*;

public class basicSTLofStacks {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        
        // st.pop(); // UnderFlow
        st.push("Raghav");
        st.push("Krishna");
        st.push("dwig");
        st.push("shrikant");
        st.push("anuj");

        System.out.println(st.size());
        System.out.println(st); // A.S O(n)
        st.pop();
        System.out.println(st + " " + st.size());
        System.out.println(st.peek()); 
        System.out.println(st.pop()); //it return the topMost element and then removes it
    }
}
