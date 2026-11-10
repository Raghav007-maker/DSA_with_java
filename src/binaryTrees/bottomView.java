package binaryTrees;

import java.util.*;

public class bottomView {

    static class Pair{
        int dist;
        Node node;

        public Pair(int dist, Node node){
            this.dist = dist;
            this.node = node;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {

        ArrayList<Integer> result = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(0, root));

        while(!q.isEmpty()){
            Pair first = q.poll();
            int dist = first.dist;
            Node node = first.node;

            map.put(dist, node.data);
            if(node.left != null) q.offer(new Pair(dist - 1, node.left));
            if(node.right != null) q.offer(new Pair(dist + 1, node.right));
        }

        for(int ele : map.keySet()){
            result.add(map.get(ele));
        }

        return result;

    }
}
