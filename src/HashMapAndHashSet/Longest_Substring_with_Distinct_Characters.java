package HashMapAndHashSet;

import java.util.HashMap;

public class Longest_Substring_with_Distinct_Characters {

    public int longestUniqueSubstr(String s) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();

        int i = 0, j = 0;
        int maxLen = 0;
        while (j < s.length()) {
            char ch = s.charAt(j);

            while (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);

                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
            }

            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            maxLen = Math.max(maxLen, j - i + 1);
            j++;
        }

        return maxLen;
    }
}
