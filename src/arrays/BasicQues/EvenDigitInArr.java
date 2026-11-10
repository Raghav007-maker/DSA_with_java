package arrays.BasicQues;
import java.util.Scanner;
public class EvenDigitInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int ans=checkEven(arr);
        System.out.println(ans);

    }
    static int checkEven(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int c=0;
            while(arr[i]!=0){
                arr[i]/=10;
                c++;
            }
            if(c%2==0) ans++;
        }
        return ans;
        
    } 
}
