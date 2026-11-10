package sortingTechniques;

import java.util.Arrays;

public class q4 {
    public static void main(String[] args) {
        int[] arr={5,2,3,4,5,7,1};
        int[] ans=cyclic(arr);
        System.out.println(Arrays.toString(ans));
        

    }
    public  static int[] cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1,-1}; 
    }
    public static void swap(int[] arr, int correct,int index) {
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }
}
