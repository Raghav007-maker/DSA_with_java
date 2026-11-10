package sortingTechniques;
import java.util.Arrays;
import java.util.Scanner;

public class query {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            int max=arr[0];
            int maxIndex=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>max){
                    maxIndex=j;
                    max=arr[j];
                }
                int temp=max;
                max=arr[maxIndex];
                arr[maxIndex]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
