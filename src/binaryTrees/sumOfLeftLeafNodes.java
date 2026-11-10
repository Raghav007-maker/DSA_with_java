package binaryTrees;


class SumTreeNode{ 
    int val;
    SumTreeNode left;
    SumTreeNode right;
    SumTreeNode(int val){
        this.val = val;
    }
}

public class sumOfLeftLeafNodes {
    public static void main(String[] args) {

    }

    public static int leftLeavesSum(SumTreeNode root) {
        
        if(root == null) return 0;
        
        return helper(root);
    }

    public static int helper(SumTreeNode root){

        if(root == null) return 0;

        int sum = 0;

        if(root.left != null){
            if(root.left.left == null && root.left.right == null) sum += root.left.val;
            else sum += helper(root.left);
        }

        sum += helper(root.right);

        return sum;
    }
}
