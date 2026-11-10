package classWork.ArrayList_Assignment;

import java.util.ArrayList;
import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();


        int[] arr=new int[3];

        int num=1;
        for(int i=0;i<10;i++){
            list.add(num);
            num++;
        }
        for(int i=0;i<10;i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
