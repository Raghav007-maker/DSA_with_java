package heap;

import java.util.PriorityQueue;

public class Min_Cost_to_Connect_Ropes {
    public int minCost(int[] arr) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int ele : arr) pq.add(ele);

        int cost = 0;
        while(pq.size() > 1){
            int first = pq.remove();
            int second = pq.remove();

            int sum = first + second;
            cost += sum;
            pq.add(sum);
        }

        return cost;
    }
}
