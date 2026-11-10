package sortingTechniques;

public class q6 {
    public static void main(String[] args) {
        char[] letters={'x','x','y','y'};
        char target='z';
        char ans=nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int st=0;
        int end=letters.length-1;
        if(target>letters[end]) return letters[0];
        else{
            while(st<end){
                int mid=st+(end-st)/2;
                if(letters[mid]>target) end=mid;
                else if(letters[mid]<=target) st=mid+1;
            }
            return letters[end];
        }
}
}