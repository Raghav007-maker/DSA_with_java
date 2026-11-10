package arrays.BasicQues;
import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=findNumber(arr);
        System.out.println(ans);
    }
    public static int findNumber(int[] arr){
        int total=0;
        for(int element:arr){
            int count=0;
            while(element!=0){
                count+=1;
                element/=10;
            }
            if(count%2==0) total+=1;

        }
        return total;
    }
    
}
