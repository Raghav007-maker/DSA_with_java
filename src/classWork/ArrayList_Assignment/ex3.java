package classWork.ArrayList_Assignment;

import java.util.ArrayList;

public class ex3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("red");
        list.add("green");
        list.add("blue");
        list.add("yellow");

        System.out.println(list);
        list.remove("blue");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        
    }
}
