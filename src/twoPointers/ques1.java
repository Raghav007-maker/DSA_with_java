// ques maximum sum obtained from cards fo k elements from start or ending if the arr
package twoPointers;
public class ques1 {
    public static void main(String[] args) {
        int[] arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        int n = arr.length;
        
        int l = 0, r = k - 1, InitialSum = 0;

        for(int i = 0; i <= r; i++){
            InitialSum += arr[i];
        }

        int maxSum = InitialSum;
        int i = 0;

        while(r >= 0){

            InitialSum = InitialSum - arr[r] + arr[n-1-i];

            maxSum = Math.max(maxSum,InitialSum);
            
            i++;
            r--;
        }
        System.out.println(maxSum);
    }
}
