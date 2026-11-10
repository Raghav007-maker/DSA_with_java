package BinarySearch.Practice;
// finding element in infinite array


public class sixth {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        int ans=infinte_array(arr,target);
        System.out.println(ans);

    }
    public static int infinte_array(int[] arr,int target){
        int st=0;
        int end=1;
        while(arr[end]<target){
            int newst=end+1;
            end=end+(end-st+1)*2;
            st=newst;
        }
        int ans=binarySearch(arr,target,st,end);
        return ans;
    }
    public static int binarySearch(int[] arr,int target,int st,int end){
        while(end>=st){
            int mid=st+(end-st)/2;
            if(target>arr[mid]){
                st=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else return mid;
        }
        return -1;
    }
}
