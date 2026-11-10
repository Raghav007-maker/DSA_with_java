package arrays.BasicQues;
public class l1 {
    public static void main(String[] args) {
        int[] arr={5,20,66,1314};
        int ans=search(arr);
        System.out.println(ans);
        
    }
    public static int search(int[] arr){
        int nc=0;
        int pc=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<0) nc++;
            else if(arr[i]>0) pc++;
        }
        if(nc>pc) return nc;
        else return pc;
    }
}
