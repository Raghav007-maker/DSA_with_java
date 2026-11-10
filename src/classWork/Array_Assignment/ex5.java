package classWork.Array_Assignment;

import java.util.Arrays;
public class ex5 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2=arr1;//Shallow Copy
        // int[] arr5=new int[arr1.length];
        // arr5=arr1; //Shallow Copy
        // System.out.println(Arrays.toString(arr5));
        arr1[0]=23;
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.toString(arr2));
        
        int[] arr3={1,2,3};
        
        int[] arr4=Arrays.copyOf(arr3, 3);//deep copy
        arr3[0]=10;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));



    }
}
// System.arraycopy(arr,0,b,0,arr.length);
