package Queue;
import java.util.*;
public class winnerOfCircularGame {
    public static void main(String[] args) {
        int ans = findTheWinner(6,5);
        System.out.println(ans);
    }

    public static int findTheWinner(int n, int k) {
        
        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= n; i++){
            q.add(i);
        }

        while(q.size() > 1){

            for(int i = 0; i < k - 1; i++){
                q.add(q.remove());
            }
            q.remove();
        }
        return q.remove();
    }
}

