package classWork.Question;

import java.util.*; 

public class ques{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        String str = "";
        
        while(no != 0){
            str += no % 2;
            no /= 2;
        }
        char[] ch = str.toCharArray();
        int left= 0;
        int right = ch.length-1;

        while(right > left){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp; 
            left++;
            right--;
        }
        str = String.valueOf(ch);
        System.out.println(str);
        sc.close();
    }
}