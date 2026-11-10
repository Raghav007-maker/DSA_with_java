package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        addAtIdx(q, 60, 3);
        System.out.println();
        removeAtIdx(q, 3);
        System.out.println();
        int peek = peekAtIdx(q, 3);
        System.out.println(peek);
    }

    public static int peekAtIdx(Queue<Integer> q, int idx) {
        int n = q.size();

        for(int i = 0; i < idx; i++){
            q.add(q.remove());
             
        }
        int ans = q.peek();  

        for(int i = 0; i < n - idx; i++){
            q.add(q.remove());
        }
        return ans;
    }

    public static void removeAtIdx(Queue<Integer> q, int idx) {
        // int n = q.size();
        for(int i = 0; i < idx; i++){
            q.add(q.remove());
        }
        q.remove();
        for(int i = 0; i < q.size() - idx; i++){
            q.add(q.remove());
        }

        for(int i = 0; i < q.size(); i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }

    public static void  addAtIdx(Queue<Integer> q, int ele, int k){

        if(k < 0 || k > q.size()){
            System.out.println("Invalid Index");
            return;
        }

        if(k == q.size()){
            q.add(ele);
            return;
        } 
        int n =q.size();
        for(int i = 0; i < n; i++){
            if(i == k){
                q.add(ele);
            }
            q.add(q.remove());
        }
        for(int i = 0; i < q.size(); i++){
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
