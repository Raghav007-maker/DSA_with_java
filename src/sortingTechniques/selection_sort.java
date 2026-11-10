package sortingTechniques;
import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxindex=0;
            for(int j=0;j<arr.length-i;j++){
                if(arr[j]>arr[maxindex]){
                    maxindex=j;
                }
            }
            int temp=arr[last];
            arr[last]=arr[maxindex];
            arr[maxindex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
