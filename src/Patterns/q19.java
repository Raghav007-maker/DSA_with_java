
//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * *
//     * * *
//       *
package Patterns;
import java.util.Scanner;
public class q19 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int no=sc.nextInt();
        int nsp=no-1,nst=1;
        for(int i=1;i<=no;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
        nst=2*no-3;
        nsp=1;
        for(int i=1;i<=no-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*"+" ");
            }
            nst-=2;
            System.out.println();
        }
    }
}
}
