package Patterns;

public class p2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=2*n;i++){
            // spaces
            int spaces=n-i;
            for(int j=spaces;j>=1;j--){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}
