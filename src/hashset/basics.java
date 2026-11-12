package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class basics {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(77);
        set.add(23);set.add(45);set.add(13);

        System.out.println(set.size());
        System.out.println(set.contains(23));
        System.out.println(set.contains(67));
        set.remove(77);

        for(int ele : set){
            System.out.println(ele);
        }
        Iterator<Integer> it =  set.iterator();
        System.out.println(set);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

