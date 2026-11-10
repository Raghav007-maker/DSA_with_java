package twoPointers;
public class constantWindow {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,-1};
        int k=2;
        int s=0;
        int e=k-1;
        int sum=0;
        int maxsum=0;
        for(int i=s;i<=e;i++){
            sum+=arr[i];
        }
        while(e<arr.length-1){
            sum=sum-arr[s];
            s++;
            e++;
            sum+=arr[e];
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);
    }
}
