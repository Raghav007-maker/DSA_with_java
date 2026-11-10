package twoPointers;
public class LongestSubarray1 {
    public static void main(String[] args) {
        int[] arr={2,5,1,7,10};
        int k=25;
        // ques--> find the size of longest subarray whose sum is less than or equal k 
        // ex longest subarray whose sum is less than or equal to k is [5,1,7] ans-3

        // 1.> bruit full approch
        int longestSize=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            int length=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>k){
                    break;
                }
                length=j-i+1;
            }
            longestSize=Math.max(longestSize,length);
        }
        System.out.println(longestSize);


        // 2.> better approch
        int arr1[]={2,5,1,10,10};
        k=14;
        int l = 0, r = 0, maxlength = 0, sum = 0;

        while(r < arr1.length){
            sum += arr1[r];

            while(sum > k){
                sum -= arr1[l];
                l ++;
            }

            if(sum <= k ){
                maxlength = Math.max(maxlength,r-l+1);
                r++;
            }
        }
        System.out.println(maxlength);
    }
}
