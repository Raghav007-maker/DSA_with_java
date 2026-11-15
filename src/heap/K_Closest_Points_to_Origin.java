package heap;

import java.util.*;

class Triplet implements Comparable<Triplet>{
    int dist;
    int x;
    int y;

    public Triplet(int dist, int x, int y){
        this.dist = dist;
        this.x = x;
        this.y = y;
    }

    public int compareTo(Triplet t){
        return Integer.compare(this.dist, t.dist);
    }
}
public class K_Closest_Points_to_Origin {
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int[] point : points){
            int x = point[0];
            int y = point[1];
            int dist = x*x + y*y;

            pq.add(new Triplet(dist, x, y));
            if(pq.size() > k) pq.remove();
        }

        while(pq.size() > 0){
            ArrayList<Integer> list = new ArrayList<>();
            Triplet t = pq.remove();
            list.add(t.x);
            list.add(t.y);
            ans.add(list);
;        }
         return ans;
    }
}
