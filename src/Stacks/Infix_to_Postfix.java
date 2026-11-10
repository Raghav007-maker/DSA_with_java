package Stacks;

import java.util.*;

public class Infix_to_Postfix {

    public static void main(String[] args) {
        String str = "a*(b+c)/d";
        System.out.println(infixToPostfix(str));
    }

    public static String infixToPostfix(String str){
        
        String ans = "";
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                ans+=ch;
            }

            else if(ch == '(') st.push(ch);

            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '(')
                    ans += st.pop();
                st.pop();
            }

            else{
                while(!st.isEmpty() && 
                (percedence(st.peek()) > percedence(ch) ||
                (percedence(st.peek()) == percedence(ch) && ch != '^'))){
                    ans+=st.pop();
                }
                st.push(ch);
            }

        }
        while(!st.isEmpty()){
            ans+=st.pop();   
        }
        return ans;
    }

    public static int percedence(char ch){
        if(ch == '+' || ch == '-') return 1;
        else if(ch == '*' || ch == '/') return 2;
        else if(ch == '^') return 3;
        return -1;
    }
}
