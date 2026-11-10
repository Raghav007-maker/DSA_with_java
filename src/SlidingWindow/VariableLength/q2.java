package SlidingWindow.VariableLength;

// Max Consecutive Ones III

public class q2 {
    public static void main(String[] args) {

        int[] arr = {0,0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1,1};
        int k = 3;
        int ans = maxOnes(arr, k);
        System.out.println(ans);
        
    }
    public static int maxOnes(int[] arr,int k){
        
        int n = arr.length; 

        int left = 0, right = 0;
        int maxLength = 0, zc = 0;

        while(right < n){

            if(arr[right] == 0){
                zc++;
            }

            while(zc > k){
                if(arr[left] == 0){
                    zc--;
                }
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);
            right++;
        }
        return maxLength;
    }
}
