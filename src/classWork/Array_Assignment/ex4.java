package classWork.Array_Assignment;

import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] ans=generatePrime(n);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] generatePrime(int n){
        int[] arr=new int[n];
        int index=0;
        int num=2;
        int count=0;
        while(count<n){
            if(isPrime(num)!=-1){
                arr[index]=num;
                index++;
                count++;
            }
            num++;
        }
        return  arr;
    }
    public static int isPrime(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)count++;
        }
        if(count==2) return n;
        return -1;
    }

}

// i*i<n //to find sqaure root of the number