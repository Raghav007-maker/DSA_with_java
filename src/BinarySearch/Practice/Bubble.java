package BinarySearch.Practice;
import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int[] arr={3,1,5,4,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        }
    }
    public static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean is_reversed=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    is_reversed=true;
                }
            }
            if(is_reversed==false){
                break;
            }
        }
    }
    public static void swap(int[] arr,int one,int second){
        int temp=arr[one];
        arr[one]=arr[second];
        arr[second]=temp;
    }
}
