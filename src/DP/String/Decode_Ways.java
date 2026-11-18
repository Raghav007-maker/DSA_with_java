package DP.String;

public class Decode_Ways {

    public static void main(String[] args) {
        String str = "11106";
        int ans = numDecodings(str);
        System.out.println(ans);

    }
    public static int numDecodings(String s) {
        return decode(s, 0);
    }

    public static int decode(String str, int i){

        if(i >= str.length()) return 1;

        if(str.charAt(i) == '0') return 0;

        int oneWay = decode(str,i + 1);

        int twoWay = 0;
        if(i + 1 < str.length()){
            int digit = (str.charAt(i) - '0') * 10 + (str.charAt(i + 1) - '0');

            if(digit >= 10 && digit <= 26) twoWay += decode(str, i + 2);
        }

        return oneWay + twoWay;
    }
}
