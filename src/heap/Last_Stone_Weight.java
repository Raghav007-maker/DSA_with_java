package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Last_Stone_Weight {
    public int lastStoneWeight(int[] stones) {

        int n = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            pq.add(stones[i]);
        }

        while(pq.size() > 1){
            int x = pq.remove();
            int y = pq.remove();

            if(x != y){
                pq.add(x - y);
            }

        }

        return pq.isEmpty() ? 0 : pq.remove();
    }
}
