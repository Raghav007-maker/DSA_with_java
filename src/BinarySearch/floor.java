// ques: find the floor element from the array
// floor:element which is Smaller than or equal to the target
package BinarySearch;

public class floor {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;

        int ans=floor(arr,target);
        System.out.println(ans);        
    }
    static int floor(int[] arr,int target){
        int st=0;
        int end=arr.length-1;
 
        while(st<=end){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else return arr[mid];
        }
        return arr[end];
    }
    
}
