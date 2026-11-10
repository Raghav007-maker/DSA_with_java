
import java.util.*;
public class wiggle_sort_2{

    public void wiggleSort(int[] nums) { 
        
        Arrays.sort(nums);
        int n = nums.length;
        int left = (n - 1) / 2;
        int right = n - 1;

        int[] arr = new int[n];

        for(int i = 0; i < nums.length; i++){

            if(i % 2 == 0){
                arr[i] = nums[left--];
            }
            else arr[i] = nums[right--];
        }

        System.arraycopy(arr, 0, nums, 0, n);
    }
} 