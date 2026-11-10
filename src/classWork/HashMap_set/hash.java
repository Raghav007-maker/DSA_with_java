package classWork.HashMap_set;


import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        String para="The sun sun was high high in the sky sky, casting casting long long shadows shadows across the field field. Birds birds chirped chirped in the trees trees while the breeze breeze whispered whispered softly softly through the leaves leaves. It was a day day of peace peace, a moment moment to breathe breathe and simply simply be be.";
        HashMap<String,Integer> map=new HashMap<>();
        String[] str=para.split(" ");
        for(String word:str){
            System.out.println(word+"-->");
            map.put(word,map.getOrDefault(word,0)+1);
            System.out.println(map);
        }
    }
}
