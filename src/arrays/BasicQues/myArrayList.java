package arrays.BasicQues;
import java.util.ArrayList;
import java.util.Scanner;

public class myArrayList {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(23);
        list.add(43);
        list.add(87);
        list.add(67);
        list.add(10);
        System.out.println(list);
        System.out.println(list.contains(23));
        list.set(3,56);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>(10);
        for(int i=0;i<4;i++){
            list1.add(sc.nextInt());
        }
        System.out.println(list1);
        }
        
        
    }
}
