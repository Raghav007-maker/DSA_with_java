package BinarySearch;

public class position_in_infinte {
    public static void main(String[] args) {
        // here we take an array of finite element but for ques it using the function which has infinite no of element
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(range(arr,target));
        
    }
    public static int range(int[] arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        int ans=search(arr,target,start,end);
        return ans;
    }
    public static int search(int[] arr,int target,int st,int end){
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>arr[mid]) st=mid+1;
            else if(target<arr[mid]) end=mid-1;
            else return mid;
        }
        return -1;
    }
}
