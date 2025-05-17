package solution.leetcode;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        CountingBits cb = new CountingBits();
        System.out.println(Arrays.toString(cb.countBits(2)));
        System.out.println(Arrays.toString(cb.countBits(5)));
    }
    public int[] countBits(int n) {
        int [] result = new int[n+1];
        for(int i = 0; i<result.length; i++){
            result[i] = sumOfBits(i);
        }
        return result;
    }
    public int sumOfBits(int n){
        int count = 0;
        String s = Integer.toBinaryString(n);
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '1') count++;
        }
        return count;
    }
}
