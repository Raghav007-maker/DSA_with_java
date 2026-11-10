package HashMapAndHashSet;

import java.util.HashMap;

public class Most_Frequent_Character {

    public static char getMaxOccuringChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int maxFreq = 0;
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxFreq = Math.max(maxFreq, map.get(ch));
        }

        char ans = 'z'; //max character

        for(char key : map.keySet()){
            if(map.get(key) == maxFreq && ans >= key){
                ans = key;
            }
        }

        return ans;


    }
}
