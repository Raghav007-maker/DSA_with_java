package binaryTrees;
import java.util.*;

class Pair{

    Node node;
    int level;
    
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }

}
public class BFSbyQueue {
    public static void main(String[] args){

        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(0);
        Node d = new Node(10);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        display(a);
        System.out.println();
        levelOrder(a);
        System.out.println();
        levelOrderLineWise(a);
    }

    public static void levelOrder(Node a){
        Queue<Node> q = new LinkedList<>();
        q.offer(a);
        while(q.size() > 0){

            Node front = q.poll();
            System.out.print(front.data + " ");
            if(front.left != null) q.offer(front.left);
            if(front.right != null) q.offer(front.right);
        }

    }
    public static void levelOrderLineWise(Node a){
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(a, 0));
        int current = 0;
        while(q.size() > 0){

            Pair front = q.poll();
            if(front.level != current){
                System.out.println();
                current++;
            }
            System.out.print(front.node.data + " ");
            if(front.node.left != null) q.offer(new Pair(front.node.left, front.level + 1));
            if(front.node.right != null) q.offer(new Pair(front.node.right, front.level + 1));
        }

    }

    public static void display(Node a){

        if(a == null) return;
        System.out.print(a.data + " ");

        display(a.left);
        display(a.right);
    }


}
