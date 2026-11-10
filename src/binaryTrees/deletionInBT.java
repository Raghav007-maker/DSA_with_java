package binaryTrees;

import java.util.*;

class DeletionNode{ 
    int val;
    DeletionNode left;
    DeletionNode right;
    DeletionNode(int val){
        this.val = val;
    }
}
public class deletionInBT {
    public static void main(String[] args) {
        
    } 
    
    public DeletionNode deleteDeletionNode(DeletionNode root, int key) {
        
        if(root == null) return null;

        Queue<DeletionNode> q =new LinkedList<>();

        q.offer(root);
        DeletionNode keyDeletionNode = null;
        DeletionNode last = null;

        while(q.size() > 0){
            DeletionNode temp = q.poll();

            if(temp.val == key) keyDeletionNode = temp;

            if(temp.left != null){
                last = temp.left;
                q.offer(temp.left);
            }

            if(temp.right != null){
                last = temp.right;
                q.offer(temp.right);
            }
        }

        if(keyDeletionNode != null){
            keyDeletionNode.val = last.val;
            deleteLast(root, last);
        }
        return root;
    }

    public void deleteLast(DeletionNode root, DeletionNode last){

        if(root == null) return;

        Queue<DeletionNode> q = new LinkedList<>();
        q.offer(root);
        
        while(q.size() > 0){

            DeletionNode temp = q.poll();

            if(temp == last){
                temp = null;
                return;
            }

            if(temp.left == last){
                temp.left = null;
                return;
            }else q.offer(temp.left);
            
            if(temp.right == last){
                temp.right = null;
                return;
            }else q.offer(temp.right);
        }
    }
     
}
