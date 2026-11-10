package BasicOfJava.Methods;
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        boolean check=prime(no);
        System.out.println(check);
           
    }
    static boolean  prime(int no){
        if (no<=1) return false;
        for(int i=2;i<=Math.sqrt(no);i++){
            if(no%i==0){
                return false;
            }
        }
        return true;
        

    }
}
