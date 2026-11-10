package Bitwise;

public class isOdd {
    public static void main(String[] args) {
        System.out.println(odd(4));
        
    }
    public static boolean odd(int n){
        return ((n&1)==1);
    }
}
