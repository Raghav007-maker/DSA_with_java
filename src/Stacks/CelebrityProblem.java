package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0},
                   {0, 1, 0},
                   {0, 1, 1}};
        int ans = celebrity(mat);
        System.out.println(ans);
        }
    public static int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            boolean flaga = true, flagb = true;
            if(mat[a][b] == 1){
                flaga = false;
            }
            else{
                flagb = false;
            }
            
            if(mat[b][a] == 1){
                flagb = false;
            }
            else{
                flaga = false;
            }
            if(flaga) st.push(a);
            if(flagb) st.push(b);
        }
        
        if(st.size() == 0) return -1;
        
        int celeab = st.pop();
        
        for(int j = 0; j < mat.length; j++){
            if(j == celeab) continue;
            if(mat[celeab][j] == 1) return -1;
        }
        
        for(int i = 0; i < n; i++){
            if(i == celeab) continue;
            if(mat[i][celeab] == 0) return -1;
        }
    return celeab;
    }
}
