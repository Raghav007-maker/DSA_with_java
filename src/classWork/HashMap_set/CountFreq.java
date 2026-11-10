package classWork.HashMap_set;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,2,3,3,3};
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){

                int oldfreq=map.get(arr[i]);
                map.put(arr[i],oldfreq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}
