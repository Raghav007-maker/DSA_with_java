package heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

class Doublet implements Comparable<Doublet> {
    int ele;
    int diff;

    public Doublet(int diff, int ele) {
        this.diff = diff;
        this.ele = ele;
    }

    @Override
    public int compareTo(Doublet o) {

        // diff bada ho to higher priority (max heap banane ke liye reverse)
        if (this.diff != o.diff) {
            return o.diff - this.diff;
        }

        // equal diff par bada element pehle
        return o.ele - this.ele;
    }
}
public class K_Closest_in_Sorted_Array {
    public ArrayList<Integer> findKClosest(int[] arr, int k, int x) {
        // code here
        PriorityQueue<Doublet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : arr){
            pq.add(new Doublet(Math.abs(ele - x), ele));

            if(pq.size() > k) pq.poll();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().ele);
        }

        Collections.sort(ans);

        return ans;
    }
}
