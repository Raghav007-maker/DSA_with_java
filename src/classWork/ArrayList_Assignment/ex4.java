package classWork.ArrayList_Assignment;

import java.util.ArrayList;

public class ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        System.out.println(list.contains(5));
        System.out.println(list.indexOf(7));
        System.out.println(list.lastIndexOf(7));


    }
}
