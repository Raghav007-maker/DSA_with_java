package classWork.HashMap_set;

import java.util.HashSet;

public class set{
    public static void main(String[] args) {
        String sentence="Hello i am studying in GLA GLA";

        String[] words=sentence.split(" ");

        HashSet<String> hash=new HashSet<>();


        for(int i=0;i<words.length;i++){
            hash.add(words[i]);
        

        System.out.println(hash);
    }
}
}
