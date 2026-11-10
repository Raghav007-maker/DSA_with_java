package arrays.BasicQues;
import java.util.Scanner;
public class forEach {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int present=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i==14){
                present=1;
                break;
            }
        }
        if(present==1) System.out.println("YES");
        else System.out.println("NO");
    }
}
