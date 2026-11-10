package arrays.BasicQues;
import java.util.ArrayList;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<Integer>(10);
        int n=sc.nextInt();
        while(n!=0){
            list.add(n);
            n=sc.nextInt();
        }
        int pe=0;
        int po=0;
        int negative=0;
        for(int ele:list){
            if(ele%2==0){
                if(ele>=0){
                    pe++;
                }
                else{
                    negative++;
                }
            }
            else if(ele>0 && ele%2!=0){
                po++;
            }
            else negative++;
        }
        System.out.println("positive Even "+pe);
        System.out.println("negative "+negative);
        System.out.println("positive Odd "+po);
    }
}
