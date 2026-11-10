package Bitwise;

public class noOfDigit {
    public static void main(String[] args) {
        int n=10;
        int b=2;

        int digit=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(digit);
    }
}
