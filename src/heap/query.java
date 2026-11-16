package heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class query {
    public static void main(String[] args) {

        int[] arr = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        PriorityQueue<Doublet2> pq = new PriorityQueue<>();

        for(int key : map.keySet()){
            pq.add(new Doublet2(key, map.get(key)));
        }

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }

}
