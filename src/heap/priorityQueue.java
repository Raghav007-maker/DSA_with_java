package heap;

import java.util.*;

public class priorityQueue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2); 
        pq.add(1); 
        pq.add(3); 
        pq.add(4); 
        pq.add(56);
        
        System.out.println(pq);
    }
}
