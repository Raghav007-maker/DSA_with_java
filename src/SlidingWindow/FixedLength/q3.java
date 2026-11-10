package SlidingWindow.FixedLength;

import java.util.*;


// Average of All Subarrays of Size K
public class q3 {
    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 5};
        int k = 3;

        double[] ans = Average(arr,k);
        System.out.println(Arrays.toString(ans));

    }
    public static double[] Average(int[] arr,int k){

        int n = arr.length;
        ArrayList<Double> list = new ArrayList<>();

        for(int i = 0; i <= n-k; i++){
            double avg = avg(arr,i,k+i,k);
            list.add(avg);
        }

        double[] result = new double[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;

    }

    public static double avg(int[] arr,int st,int end,int k){
        
        double sum = 0;
        for(int i = st; i < end; i++){
            sum += arr[i];
        }
        return sum/k;
    }
}
