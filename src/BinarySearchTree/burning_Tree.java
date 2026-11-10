package BinarySearchTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class burning_Tree {

    static Node start;
    static HashMap<Node, Node> parent;

    static class Pair{
        Node n;
        int level;
        public Pair(Node n, int level){
            this.n = n;
            this.level = level;
        }
    }

    public int minTime(Node root, int target) {
        // code here
        start = null;
        parent = new HashMap<>();

        dfs(root, target);
        HashSet<Node> burned = new HashSet<>();

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int time = 0;
        while(!q.isEmpty()){
            Pair p = q.poll();
            Node node = p.n;
            int dist = p.level;
            time = Math.max(time, dist);

            if(node.left != null && !burned.contains(node.left)) {
                q.add(new Pair(node.left, dist + 1));
                burned.add(node.left);
            }
            if(node.right != null && !burned.contains(node.right)) {
                q.add(new Pair(node.right, dist + 1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))) {
                q.add(new Pair(parent.get(node), dist + 1));
                burned.add(node.right);
            }
        }
        return time;
    }

    public static void dfs(Node root, int target){
        if(root == null) return;

        if(root.data == target) start = root;

        if(root.left != null) parent.put(root.left, root);
        if(root.right != null) parent.put(root.right, root);
        dfs(root.left, target);
        dfs(root.right, target);
    }
}
