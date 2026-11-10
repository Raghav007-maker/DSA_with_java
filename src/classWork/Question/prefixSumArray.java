package classWork.Question;

import java.util.Scanner;

public class prefixSumArray {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        int[] arr={3,4,3,2,4,6,7};
        int sum=0;
        int[] prefix=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefix[i]=sum;
        }
        int q[][]= {{1,2},{5,6},{2,3}};

        for(int pair[]:q){
            int start=pair[0];
            int end=pair[1];
            
            if(start==0){
                int rangeSum=prefix[end];
                System.out.println(rangeSum);
            }
            
            else{
                int rangeSum=prefix[end]-prefix[start-1];
                System.out.println(rangeSum);
            }
        }
        }
    }
}
