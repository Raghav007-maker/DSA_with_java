package classWork.Array_Assignment;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(right>left){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}
