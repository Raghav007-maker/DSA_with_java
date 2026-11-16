package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;


class Doublet2 implements Comparable<Doublet2>{
    int freq;
    int key;

    public Doublet2(int key, int freq){
        this.freq = freq;
        this.key = key;
    }

    public int compareTo(Doublet2 o){

        if(this.freq == o.freq) return this.key - o.key;
        return this.freq - o.freq;
    }

    @Override
    public String toString() {
        return "(" + key + "," + freq + ")";
    }
}
public class Top_K_Frequent_in_Array {
    class Solution {
        public ArrayList<Integer> topKFreq(int[] arr, int k) {

            HashMap<Integer, Integer> map = new HashMap<>(); //ele, freq

            for (int j : arr) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }

            PriorityQueue<Doublet2> pq = new PriorityQueue<>();

            for(int key : map.keySet()){

                pq.add(new Doublet2(key, map.get(key)));
                if(pq.size() > k) pq.remove();
            }

            ArrayList<Integer> ans = new ArrayList<>();

            while(!pq.isEmpty()){
                ans.add(pq.poll().key);
            }

            Collections.reverse(ans);
            return ans;
        }
    }
}
