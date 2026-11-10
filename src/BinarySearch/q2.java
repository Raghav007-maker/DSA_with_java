package BinarySearch;

public class q2 {
    public static void main(String[] args) {
        
        int[] nums={3,0,1};
        int ans=search(nums);
        System.out.println(ans);
    }
    public static int search(int[] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (correct >= 0 && nums[i] != nums[correct]) {
                swap(nums, correct, i);
            } else
                i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1) {
                return j + 1;
            }
        }

        return -1;
    }
    

    public static  void swap(int[] arr, int correct, int i) {
        int temp = arr[correct];
        arr[correct] = arr[i];
        arr[i] = temp;
    }

}
