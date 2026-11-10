package BasicOfJava.loops;

// import java.util.Scanner;
public class devide {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int x=4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y){
                continue;
            }
            else{
                System.out.println(x+" "+y);
            }
        }
    }
}
