package heap;

import java.util.*;

public class HeapDemo {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10); pq.add(20); pq.add(-30);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        pq.add(23); pq.add(8);pq.add(213); pq.add(54);
        for(int ele : pq){
            System.out.print(ele + " ");
        }

    }
}
