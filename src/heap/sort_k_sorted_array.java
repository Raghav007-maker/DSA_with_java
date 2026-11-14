package heap;

import java.util.PriorityQueue;

public class sort_k_sorted_array {

    public void nearlySorted(int[] arr, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = arr.length;

        int idx = 0;

        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                arr[idx++] = pq.remove();
            }
        }

        while(!pq.isEmpty()){
            arr[idx++] = pq.remove();
        }

    }
}
