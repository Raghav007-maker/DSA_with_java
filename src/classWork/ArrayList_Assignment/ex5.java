package classWork.ArrayList_Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex5 {
    public static void main(String[] args) {

        String[] arr={"A","B","C"};
        ArrayList<String> list=new ArrayList<>();

        // M-1
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println(list);

        // M-2
        List<String> list2 =new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

    }
}
