class LongestBitonicSubseq{
    
    public static int longestBitonicSequence(int n, int[] nums) {
        
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        
        dp1[0] = 1;
        dp2[n-1] = 1;


        for(int i = 1; i < n; i++){

            int max = 0;
            for(int j = i - 1; j >= 0; j--){

                if(nums[i] > nums[j]){
                    max = Math.max(max, dp1[j]);
                }
            }
            dp1[i] = max + 1;
        }
        
        for(int i = n-2; i>=0; i--){
            
            int max = 0;
            for(int j = i + 1; j < n; j++){
                if(nums[i] > nums[j]){
                    max = Math.max(max, dp2[j]);
                }
            }
            dp2[i] = max + 1;
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(dp1[i] != 1 && dp2[i] != 1) ans = Math.max(ans, dp1[i] + dp2[i] - 1);
        }
    
        return ans;
    
    }
}