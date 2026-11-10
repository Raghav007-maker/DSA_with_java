package classWork.Array_Assignment;

import java.util.Arrays;
public class ex6 {
    public static void main(String[] args) {
        int[] arr={7,2,9,4,1};
        
        Arrays.sort(arr);
        int index=Arrays.binarySearch(arr, 4);
        
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }
}
