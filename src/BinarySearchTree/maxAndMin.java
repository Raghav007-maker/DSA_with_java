package BinarySearchTree;


public class maxAndMin {
    public static void main(String[] args) {
        
        Node root = new Node(10);

        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);

        // Build right subtree
        root.right = new Node(15);
        root.right.left = new Node(12);
        // root.right.right = new Node(20);

        // Test: print preorder traversal
        System.out.println(min(root));
        System.out.println(max(root));

    }

    public static int min(Node root){

        int min = Integer.MAX_VALUE;
        while(root != null){
            min = Math.min(min, root.data);
            root = root.left;
        }
        return min;
    }

    public static int max(Node root){

        int max = Integer.MIN_VALUE;
        while(root != null){
            max = Math.max(max, root.data);
            root = root.right;
        } 
        return max;
    }
} 