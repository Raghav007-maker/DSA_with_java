package heap;

import java.util.PriorityQueue;

class Doublet3 implements Comparable<Doublet3>{
    int ele;
    int idx;

    public Doublet3(int ele, int idx){
        this.ele = ele;
        this.idx = idx;
    }

    public int compareTo(Doublet3 o){
        if(this.idx == o.idx) return this.ele - o.ele;

        return this.idx - o.idx;
    }

}
public class Mice_and_Cheese {

    public int miceAndCheese(int[] reward1, int[] reward2, int k) {

        PriorityQueue<Doublet3> pq = new PriorityQueue<>();

        int sum = 0;

        for(int i = 0; i < reward1.length; i++){
            pq.add(new Doublet3(reward1[i], i));

            if(pq.size() > k) pq.remove();
        }

        for(int i = 0; i < reward2.length; i++){
            pq.add(new Doublet3(reward2[i], i));

            if(pq.size() > k) pq.remove();
        }

        while(!pq.isEmpty()){
            sum += pq.poll().ele;
        }
        return sum;
    }
}
