package sortingTechniques;
import java.util.Arrays;
public class select {
    public static void main(String[] args) {
        
        int[] arr = {5,3,4,1,2};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            int min = arr[i];
            int min_idx = i;

            for(int j = i; j < n; j++){
                if(arr[j] < min){
                    min = arr[j]; 
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
 