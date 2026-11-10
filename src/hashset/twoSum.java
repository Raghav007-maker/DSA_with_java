package hashset;

import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {
    }
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        boolean flag = false;
        for(int ele : arr){
            if(set.contains(target - ele)){
                flag = true;
                break;
            }
            set.add(ele);
        }
        return flag;
    }
}
