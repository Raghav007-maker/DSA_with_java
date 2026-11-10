package arrays.BasicQues;

public class q13 {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,8,8,10};
        int target=7;
        int st=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                st=i;
                break;
            }
        }
        int end=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                end=i;
                break;
            }
        }
        System.out.println(st+" "+end);

    }
}
