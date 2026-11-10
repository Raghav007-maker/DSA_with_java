package Patterns;

public class q21b {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            // stars 1st phase
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces=(n-i)*2;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // stars 2nd Phase
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        // reverted Pattern
        for(int i=n;i>=1;i--){
            // stars 1st phase
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // spaces
            int spaces=(n-i)*2;
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // stars 2nd Phase
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); 
        }
        
    }
}
