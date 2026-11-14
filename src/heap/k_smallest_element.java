package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class k_smallest_element {
    public int kthSmallest(int[] arr, int k) {


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < k; i++){
            pq.add(arr[i]);
        }

        for(int i = k; i < arr.length; i++){
            pq.add(arr[i]);
            pq.remove();
        }

        return pq.peek();
    }
}
