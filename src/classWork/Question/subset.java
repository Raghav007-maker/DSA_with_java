package classWork.Question;


import java.util.Arrays;
import java.util.HashSet;

public class subset {
    public static void main(String[] args) {
    
        int arr[] = {4,2,-3,1,6};
        int n = arr.length;
        // for (int start = 0; start < n; start++) {
        //     for (int end = start; end < n; end++) {
        //         for (int k = start; k <= end; k++) {
        //             System.out.print(arr[k] + " ");
        //         }
        //     System.out.println();
        //     }

        // }
        boolean ans=subarray(arr);
        System.out.println(ans);
    }

    public static boolean subarray(int[] arr){
        int[] prefixSum=new int[arr.length];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            prefixSum[i]=sum;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        for(int num:prefixSum){
            uniqueElements.add(num);
        }
        return prefixSum.length==uniqueElements.size();  
    } 
}
