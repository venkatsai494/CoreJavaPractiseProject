package solution.leetcode;

import java.util.Arrays;

public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        NumberOfEvenAndOddBits obj = new NumberOfEvenAndOddBits();
        System.out.println(Arrays.toString(obj.evenOddBit(50))); // [1,2]
        System.out.println(Arrays.toString(obj.evenOddBit(17))); // [2,0]
        System.out.println(Arrays.toString(obj.evenOddBit(2))); // [1,1]
    }
    public int[] evenOddBit(int n) {
        int[] result = new int[2];
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        int even = 0;
        int odd = 0;
        for(int i = 0; i<s1.length(); i = i+2){
            if(s1.charAt(i) == '1') even++;
        }
        for(int i = 1; i<s1.length(); i = i+2){
            if(s1.charAt(i) == '1') odd++;
        }
        result[0] = even;
        result[1] = odd;
        return result;
    }
}
