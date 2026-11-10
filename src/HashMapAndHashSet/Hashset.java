package HashMapAndHashSet;

import java.util.HashSet;
import java.util.Iterator;
public class Hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // Inserting an Element
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        // ADD
        System.out.println(set);  
        
        System.out.println(set.size());

        // Search
        if(set.contains(1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        // remove
        set.remove(2);
        System.out.println(set); 
        
        // iterator
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
