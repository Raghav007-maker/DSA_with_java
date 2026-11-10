package binaryTrees;

class DepthNode{ 
    int val;
    DepthNode left;
    DepthNode right;
    DepthNode(int val){
        this.val = val;
    }
}

public class minDepthBT {
    public static void main(String[] args) {
        
    }   
    int minDepth(DepthNode root) {
        // code here
        return min(root);
    }
    
    public int min(DepthNode root){
        
        if(root.left == null && root.right == null) return 1;
        
        if(root.right == null) return 1 + min(root.left);
        
        if(root.left == null) return 1 + min(root.right);
        
        return 1 + Math.min(min(root.left), min(root.right));
    } 
}

