package sortingTechniques;
// return the duplicate element from array , range [1,n]
public class q2 {
    public static void main(String[] args) {
        int[] nums={1,1};
        int ans=cyclic(nums);
        System.out.println(ans);
    }
    public static int cyclic(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }  
        }
        if(nums[nums.length-1]!=nums.length){
            return nums[nums.length-1];
        }
        else return -1;
    }
    public static void swap(int[] nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;

    }
}
