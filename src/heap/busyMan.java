package heap;

import java.util.*;

public class busyMan {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pair[] arr = new Pair[n];

        Arrays.sort(arr, (a,b) -> a.end - b.end);

        int activity = 1;

        int end = arr[0].end;

        for(int i = 0; i < arr.length; i++){
            if(arr[i].st == end){
                activity++;
                end = arr[i].end;
            }
        }

        System.out.println(activity);
    }
}

class Pair{
    int st;
    int end;
    Pair(int st, int end){
        this.st = st;
        this.end= end;
    }
}
