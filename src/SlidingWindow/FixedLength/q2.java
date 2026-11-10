package SlidingWindow.FixedLength;
// First Negative Number in Every Window of Size K
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] res = negativeNumber(arr, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] negativeNumber(int[] arr,int k){

        int n = arr.length;

        List<Integer> list = new ArrayList<>();

        // iterate only over valid window start positions
        for(int i = 0; i <= n - k; i++){
            int digit = checkNeg(arr, i, i + k);
            list.add(digit);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public static int checkNeg(int[] arr,int one,int two){
        for(int i = one; i < two; i++){
            if(arr[i] < 0){
                return arr[i];
            }
        }
        return 0;
    }
}

// Not Optimal
// can be Optimised by using Queue Later
