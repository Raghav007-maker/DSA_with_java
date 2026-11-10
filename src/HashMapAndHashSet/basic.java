package HashMapAndHashSet;

import java.util.*;
public class basic {
    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        
        // Order Not Fix
        map.put("Raghav",1000);
        map.put("Anuj",1000);
        map.put("Mradul",1000);
        System.out.println(map);
        
        // Replace Value
        map.put("Raghav",10000);
        System.out.println(map);
        
        // Search
        if(map.containsKey("Raghav")){
            System.out.println("YES"); 
        }else System.out.println("NO");

        System.out.println(map.get("Anuj"));
        System.out.println(map.get("dwig"));

        // 1st Iteration
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // 2 Iteration
        Set<String> keys = map.keySet();
        
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        map.remove("Mradul");
        System.out.println(map);
        System.out.println(map.values());
    }
}