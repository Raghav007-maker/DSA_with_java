package binaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListTreeNode {
    public int val;
    public ListTreeNode left;
    public ListTreeNode right;

    public ListTreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BTfromList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        ListTreeNode root = buildTree(list);
        display(root);
    }

    public static void display(ListTreeNode a){

        if(a == null) return;
        String str = "<--" + a.val + "-->";
        if(a.left != null){
            str = a.left.val + str;
        } 
        else str = "." + str;

        if(a.right != null){
            str = str + a.right.val;
        }
        else str = str + ".";
        
        System.out.println(str);

        display(a.left);
        display(a.right);
    }

    public static ListTreeNode buildTree(List<Integer> nodes){

        return tree(nodes, 0);

    }

    public static ListTreeNode tree(List<Integer> list, int i){

        if(i >= list.size()) return null;

        ListTreeNode root = new ListTreeNode(list.get(i));
        root.left = tree(list, i * 2 + 1);
        root.right = tree(list, i * 2 + 2);
        return root;
    }
}
