package classWork.Question;


import java.util.HashMap;

public class subArrayAsSum {
    public static void main(String[] args) {

        HashMap<Integer,Integer> map=new HashMap<>();
    
        int[] arr={1,2,3,4,5,67};
        int sum=0;
        int target=9;

        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];
            if(map.containsKey(sum-target)){
                System.out.println(true);
                break; 
            }
            else{
                map.put(sum,i);
            }
        }
    }
}
