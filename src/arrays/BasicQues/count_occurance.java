package arrays.BasicQues;
import java.util.Arrays;
import java.util.Scanner;

public class count_occurance {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int maxOccur=0;
        int ele=arr[0];
        for(int i=0;i<arr.length;i++){
            int count=0;
            int no=arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==no){
                    count++;
                }
            }
            if(count>maxOccur) {
                maxOccur=count;
                ele=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(ele+" "+maxOccur);
        }
        // sc.close();
    }
}
