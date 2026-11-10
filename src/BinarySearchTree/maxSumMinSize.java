package BinarySearchTree;


class SubtreeNode{
    SubtreeNode left;
    SubtreeNode right;
    int data;

    public SubtreeNode(int val){
        this.data = val;
    } 
}

class Quad{
    int max;
    int min;
    int sum;
    int size;

    public Quad(){}
    public Quad(int max, int min, int sum, int size){
        this.max = max;
        this.size = size;
        this.min = min;
        this.sum = sum;
    }
}

public class maxSumMinSize {
    public static void main(String[] args){

        SubtreeNode root = new SubtreeNode(10);

        root.left = new SubtreeNode(5);
        root.left.left = new SubtreeNode(2);
        root.left.right = new SubtreeNode(7);

        // Build right subtree
        root.right = new SubtreeNode(15);
        root.right.left = new SubtreeNode(12);

        Quad ans = maxMinSizeSum(root);
        System.out.println(ans.max);
        System.out.println(ans.min);
        System.out.println(ans.size);
        System.out.println(ans.sum);

    }

    public static Quad maxMinSizeSum(SubtreeNode root){

        if(root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);

        Quad left = maxMinSizeSum(root.left);
        Quad right = maxMinSizeSum(root.right);

        Quad p = new Quad();

        p.max = Math.max(root.data, Math.max(left.max, right.max));
        p.min = Math.min(root.data, Math.min(left.min, right.min));

        p.size = 1 + left.size + right.size;
        p.sum = left.sum + right.sum + root.data;

        return p;
    }
}
