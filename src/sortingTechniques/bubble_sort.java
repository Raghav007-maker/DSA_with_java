package sortingTechniques;
import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int n = arr.length;

        for(int i=0;i<n-1;i++){ //n-1 because if n-1 elements are there correct place then the remaining one element will automatically be in its correct place ex-[3,1,2]


            boolean sorted = true; // this is used to check if in the array there is any element which is remaning un sort.. ex-[1,2,3,4,5]


            for(int j=0;j<n-i-1;j++){ // after each iteration of i the last element of the array is is the max from remaining unsorted array that,s why after one main iteration we are reducing the space of array which we have to sort ex-[5, 4, 3, 2, 1] --> [4,3, 2, 1, 5] excluding last element in further iterations


                if(arr[j]>arr[j + 1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    sorted = false;
                }
            }

            
            if(sorted) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
