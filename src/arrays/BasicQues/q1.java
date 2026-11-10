package arrays.BasicQues;
import java.util.Scanner;
public class q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int[] marks=new int[size];
        System.out.println("Enter element of array");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter no you want to check");
        int var=sc.nextInt();
        for(int i=0;i<size;i++){
            if(var==marks[i]){
                System.out.print(i);
            }
        }
        sc.close();
    }
}