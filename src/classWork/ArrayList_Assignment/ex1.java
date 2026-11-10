package classWork.ArrayList_Assignment;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Raghav");
        list.add("Rishi");
        list.add("Ronak");
        list.add("Ravi");
        list.add("Rohit");

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for(String ele:list){
            System.out.print(ele+" ");
        }
        System.out.println();

        list.set(1,"Ram");
        for(String ele:list){
            System.out.print(ele+" ");
        }

        // System.out.println(list.get(10));//Error
    }
}
