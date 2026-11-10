package SlidingWindow.FixedLength;
//  Maximum of All Subarrays of Size K

import java.util.*;
public class q4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ans = maxFromSub(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] maxFromSub(int[] arr,int k){
        
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <= n-k; i++){
            int digit = findMax(arr,i,k+i);
            list.add(digit);
        }

        int result[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static int findMax(int[] arr,int one,int two){
        int max = arr[one];
        for(int i = one; i < two; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
