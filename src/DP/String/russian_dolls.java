package String;

import java.util.*;
public class russian_dolls{

    public int maxEnvelopes(int[][] envelopes) {
        
        Arrays.sort(envelopes, (a, b) -> {
            if(a[0] == b[0]) return Integer.compare(b[1], a[1]); 
            else return Integer.compare(a[0], b[0]);
    });
        
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < envelopes.length; i++){

            if(list.size() == 0 || list.get(list.size() - 1) < envelopes[i][1]){
                list.add(envelopes[i][1]);
            }
            else LB(list, envelopes[i][1]);
        }

        return list.size();
    }
    public void LB(ArrayList<Integer> list, int ele){

        int st = 0;
        int end = list.size() - 1;

        while(st <= end){

            int mid = st + (end - st) / 2;

            if(list.get(mid) == ele){
                list.set(mid, ele);
                return;
            }
            else if(list.get(mid) > ele) end = mid - 1;
            else st = mid + 1;
        }
        list.set(st, ele);
    }
}