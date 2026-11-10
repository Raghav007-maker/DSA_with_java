package heap;

import java.util.*;

public class heapSort {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] arr = {1,2,3,5,7,121,34,32,456,43,50};

        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }
        int i = 0;
        while(!pq.isEmpty()){
            arr[i++] = pq.poll();
        }

        System.out.println(Arrays.toString(arr));
    }
}
