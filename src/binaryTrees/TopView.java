package binaryTrees;

import java.util.*;
public class TopView {

    static class Pair{
        int dist;
        Node node;

        public Pair(int dist, Node node){
            this.dist = dist;
            this.node = node;
        }
    }
//    through hashmap
    public static ArrayList<Integer> topView(Node root) {
        if(root == null) return new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(0, root));
        int minDist = Integer.MAX_VALUE, maxDist = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair p = q.poll();
            int dist = p.dist;
            Node n = p.node;

            minDist = Math.min(dist, minDist);
            maxDist = Math.min(dist, maxDist);
            if(!map.containsKey(dist)){
                map.put(dist, n.data);
            }

            if(n.left != null) q.offer(new Pair(dist - 1, n.left));
            if(n.right != null) q.offer(new Pair(dist + 1, n.right));
        }

        for(int i = minDist; i <= maxDist; i++){
            result.add(map.get(i));
        }
        return result;
    }
//    through treeMap
//    public static ArrayList<Integer> topView(Node root) {
//        if(root == null) return new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        TreeMap<Integer, Integer> map = new TreeMap<>();
//        Queue<Pair> q = new LinkedList<>();
//
//        q.add(new Pair(0, root));
//
//        while(!q.isEmpty()){
//            Pair p = q.poll();
//            int dist = p.dist;
//            Node n = p.node;
//
//            if(!map.containsKey(dist)){
//                map.put(dist, n.data);
//            }
//
//            if(n.left != null) q.offer(new Pair(dist - 1, n.left));
//            if(n.right != null) q.offer(new Pair(dist + 1, n.right));
//        }
//
//        for(int key : map.keySet()){
//            result.add(key);
//        }
//        return result;
//    }
}

