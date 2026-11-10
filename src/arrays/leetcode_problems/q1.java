package arrays.leetcode_problems;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        // for(int i=0;i<num1.length;i++){
            
        // }
        merge(num1,3,num2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] num3=new int[6];
            for(int i=0;i<m;i++){
                num3[i]=nums1[i];
            }
            for(int i=0;i<n;i++){
                num3[i+m]=nums2[i];
            }
            Arrays.sort(num3);
            System.out.println(Arrays.toString(num3));
        }
    
}

