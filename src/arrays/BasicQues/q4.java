package arrays.BasicQues;
import java.util.*;
public class q4 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isAscending=false;

            }

        }
        if(isAscending) System.out.println("Asecending Order");
        else System.out.println("not in Ascending order");
        }

    }
}
