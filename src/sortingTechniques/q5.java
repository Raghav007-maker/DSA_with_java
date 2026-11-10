package sortingTechniques;

import java.util.Arrays;

public class q5 {
    public static void main(String[] args) {
        int[] arr={-1,1,3};
        int ans=cyclic(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    public static int cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if( arr[i]>0 && arr[i]<=arr.length && arr[i]!=arr[correct] ){
                swap(arr,correct,i);
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1) return (j+1);
        }
        return arr.length+1;
    }

    public static void swap(int[] arr, int correct,int index) {
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }
}
