package Patterns;
 
public class p1 {
    public static void main(String[] args) {
        int n=15;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }System.out.println();
        // }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // n-=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
