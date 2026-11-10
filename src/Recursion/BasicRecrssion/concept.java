package Recursion.BasicRecrssion;

public class concept {
    public static void main(String[] args) {
        int n=5;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0) return;
        System.out.println(n);
        // concept(n--); //this will first pass the variable or number to the function then decrement the value causing infinite loop

        printNumbers(--n);  //this will decrement the value  then pass the variable or number to the function 
    }
}
