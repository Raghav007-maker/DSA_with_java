package binaryTrees;

class ImplementationNode{ 
    int val;
    ImplementationNode left;
    ImplementationNode right;
    ImplementationNode(int val){
        this.val = val;
    }
}

public class Implementation {

    public static void main(String[] args) {
        
        ImplementationNode a = new ImplementationNode(3);
        ImplementationNode b = new ImplementationNode(4);
        ImplementationNode c = new ImplementationNode(0);
        ImplementationNode d = new ImplementationNode(0);
        ImplementationNode e = new ImplementationNode(1);
        ImplementationNode f = new ImplementationNode(6);
        ImplementationNode g = new ImplementationNode(9);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(nonZeroProduct(a));
        System.out.println(max(a));
        System.out.println(levels(a));
        System.out.println(search(a, 9));
        preOrder(a);
    }

    public static void preOrder(ImplementationNode a){

        if(a == null) return;
        System.out.print(a.val + " ");
        preOrder(a.left);
        preOrder(a.right);

    }
    public static boolean search(ImplementationNode a, int target){

        if(a == null) return false;

        if(a.val == target) return true;

        return search(a.left, target) || search(a.right, target);

    }

    public static void display(ImplementationNode a){

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

    public static int size(ImplementationNode a){

        if(a == null) return 0;
        return 1 + size(a.left) + size(a.right);
    }

    public static int sum(ImplementationNode a){

        if(a == null) return 0;
        return a.val + sum(a.left) + sum(a.right);
    }

    public static int product(ImplementationNode a){
        if(a == null) return 1;
        return a.val * product(a.left) * product(a.right);
    }

    public static int nonZeroProduct(ImplementationNode a){
        if(a == null) return 1;
        if(a.val == 0) return 1 * nonZeroProduct(a.left) * nonZeroProduct(a.right); 
        return a.val * nonZeroProduct(a.left) * nonZeroProduct(a.right); 
    }


    public static int max(ImplementationNode a){
        if(a == null) return Integer.MIN_VALUE;
        return Math.max(a.val, Math.max(max(a.left), max(a.right)));
    }

    public static int levels(ImplementationNode a){
        if(a == null) return 0;

        return 1 + Math.max(levels(a.left), levels(a.right));
    }
}
