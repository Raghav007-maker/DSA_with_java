package sortingTechniques;

public class q1 {
    public static void main(String[] args) {
        int[] arr={0,1,3};
        int ans=cyclic(arr);
        System.out.println(ans);

    }

    
    public static int cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,correct,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }    
        return arr.length; 
    }
    // swaping
    public static void swap(int[] arr, int correct,int index) {
        
        int temp=arr[index];
        arr[index]=arr[correct];
        arr[correct]=temp;
    }
}

