package src.practiceQues;

public class l3 {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        int ans=singleNumber(nums);
        System.out.println(ans);
        
    }

public static int singleNumber(int[] nums) {

        int right=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[right]==nums[j]){
                    count++;
                }
                 
            }
            if(count==1){
                return nums[right];
            }
            right++;
        }
        return -1;
        
    }
}
